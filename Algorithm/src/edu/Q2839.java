package edu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q2839 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int target = Integer.parseInt(br.readLine());
		int n = target/5;
		int remain = target%5;
		int c = 0;
		int result = 0; 
		
		
		while(c<=n) {
			remain = target - 5*(n-c);
			if(remain%3 == 0) {
				result = n - c + remain/3;
				break;
			}else {
				result = -1;
			}
			c = c + 1;
		}
		
		bw.write(Integer.toString(result));
		bw.close();
	}

}
