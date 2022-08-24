package edu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q5622 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int[] a = new int[26];
		int c = 0;
		int time = 3;
		int sum = 0;
		
		char[] str = br.readLine().toCharArray();
		
		while(c<26) {
			if(c == 15 || c == 22) {
				a[c] = time;
				a[c+1] = time;
				a[c+2] = time;
				a[c+3] = time;
				time = time + 1;
				c = c + 4;
			}else {
				a[c] = time;
				a[c+1] = time;
				a[c+2] = time;
				time = time + 1;
				c = c + 3;
			}
		}
		
		for(int i = 0; i < str.length; i++) {
			sum = sum + a[(byte)str[i]-65];
		}

		bw.write(Integer.toString(sum));
		bw.close();
	}

}
