package edu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Q1110 {

	public static void main(String[] args) throws Exception {
		int c = 0;
		int x = 0;
		int y = 0;
		int start = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] str = br.readLine().split("");
		String[] str1;
		start = Integer.parseInt(str[0]);
		
		if(Integer.parseInt(String.valueOf(str)) < 10) {
			x = 0;
			y = Integer.parseInt(String.valueOf(str[0]));
		}else {
			x = Integer.parseInt(String.valueOf(str[0]));
			y = Integer.parseInt(String.valueOf(str[1]));
		}
		
		bw.write(Integer.toString(start));
		
		/*str = Integer.toString(x + y).toCharArray();
		str[0] = (char)y;
		c = 1;
		
		bw.write(str);
		bw.flush();
		
		while(start != Integer.parseInt(String.valueOf(str))) {
			x = Integer.parseInt(String.valueOf(str[0]));
			y = Integer.parseInt(String.valueOf(str[1]));
			if(x+y<10) {
				str[0] = str[1];
				str[1] = (char)(x+y);
			}else {
				str[0] = str[1];
				str1 = Integer.toString(x+y).toCharArray();
				str[1] = str1[1];
			}
			c = c + 1;
		}
		*/
		bw.write(c + "\n");	
		bw.close();
	}
}
