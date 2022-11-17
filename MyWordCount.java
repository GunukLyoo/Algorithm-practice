package mju.myhadoop.wordcount;

import java.io.IOException;
import java.util.StringTokenizer;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.Reducer;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.input.TextInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import org.apache.hadoop.mapreduce.lib.output.TextOutputFormat;

public class WordCount {
	
    public static class Map extends Mapper<LongWritable, Text, Text, IntWritable> {
        private final static IntWritable one = new IntWritable(1);
        private Text word = new Text();
        private String before = new String();
        private String after = new String();
        private int n;
        private String opt;
        @Override
        protected void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {
        	opt = context.getConfiguration().get("option");
        	String line = value.toString();
            StringTokenizer tokenizer = new StringTokenizer(line);
            while (tokenizer.hasMoreTokens()) {
            	before = tokenizer.nextToken();
            	for(int i = 0; i < before.length(); i++) {
            		n = before.charAt(i);
            		if(n >= 65 && n <= 90) {
            			after = after + (char)n;
            		}else if(n >= 97 && n <= 122) {
            			after = after + (char)n;
            		}
            	}
            	if(opt.equals("upper")) {
            		after = after.toUpperCase();
            	}else if(opt.equals("lower")) {
            		after = after.toLowerCase();
            	}
            	
            	if(after.length() > 0) {
            		word.set(after);
                	context.write(word, one);
            	}
                after = "";
            }
        }
    }

    public static class Reduce extends Reducer<Text, IntWritable, Text, IntWritable> {
        private IntWritable value = new IntWritable(0);
        private String opt;
        private char c;
        @Override
        protected void reduce(Text key, Iterable<IntWritable> values, Context context) throws IOException, InterruptedException {
            int sum = 0;
            opt = context.getConfiguration().get("option");
            for (IntWritable value : values)
                sum += value.get();
            value.set(sum);
            
            if(opt.equals("st-up")) {
            	if(key.getLength()>0) {
            		c = key.toString().charAt(0);
            		if(Character.isUpperCase(c)) {
                    	context.write(key, value);
            		}
            	}
            }else {
                context.write(key, value);
            }
            
        }
    }

    public static void main(String[] args) throws Exception {
    	Configuration conf = new Configuration();
    	conf.set("option", args[2]);
        Job job = new Job(conf, "wordcount");
        job.setJarByClass(WordCount.class);
        job.setOutputKeyClass(Text.class);
        job.setOutputValueClass(IntWritable.class);
        job.setMapperClass(Map.class);
        job.setReducerClass(Reduce.class);
        job.setInputFormatClass(TextInputFormat.class);
        job.setOutputFormatClass(TextOutputFormat.class);
        job.setNumReduceTasks(1);

        FileInputFormat .setInputPaths(job, new Path(args[0]));
        FileOutputFormat.setOutputPath(job, new Path(args[1]));

        boolean success = job.waitForCompletion(true);
        System.out.println(success);
    }
}