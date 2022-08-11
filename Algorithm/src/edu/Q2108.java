package edu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Q2108 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n;
		int c = 0;
		int sum = 0;
		int no1;
		int no2, no3, no4;
		int max;
		int index;
		
		n = Integer.parseInt(br.readLine());
		int[] num = new int[n];
		int[] count = new int[n];
		
		
		Arrays.fill(count, 1);
		
		while(c<n) {
			num[c] = Integer.parseInt(br.readLine());
			sum = sum + num[c];
			c = c + 1;
		}
		
		Arrays.sort(num);
		
		for(int i = 1; i < n; i++) {
			if(num[i] == num[i-1]) {
				count[i] = count[i] + count[i-1];
			}
		}
		
		max = count[0];
		index = 0;
		c = 1;
		
		for(int i = 1; i < n; i++) {
			if(max<count[i]) {
				max = count[i];
				index = i;
				c = 1;
			}else if(max == count[i]) {
				c = c + 1;
				if(c == 2) {
					max = count[i];
					index = i;
				}
			}
		}
		
		no1 = (int)Math.round( (float)sum / (float)n);
		no2 = num[(n-1)/2];
		no3 = num[index];
		no4 = num[n-1] - num[0];
		
		bw.write(Integer.toString(no1) + "\n");
		bw.write(Integer.toString(no2) + "\n");
		bw.write(Integer.toString(no3) + "\n");
		bw.write(Integer.toString(no4));
		bw.close();
	}

}
