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
		
		n = Integer.parseInt(br.readLine());
		int[] num = new int[n];
		
		while(c<n) {
			num[c] = Integer.parseInt(br.readLine());
			sum = sum + num[c];
			c = c + 1;
		}
		
		Arrays.sort(num);
		
	}

}
