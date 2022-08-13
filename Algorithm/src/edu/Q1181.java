package edu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Q1181 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n;
		int c = 0;
		
		n = Integer.parseInt(br.readLine());
		String[] arr = new String[n];
		int[][] count = new int[50][n];
		
		while(c < n) {
			arr[c] = br.readLine();
			c = c + 1;
		}
		
	//	Arrays.sort(arr, (s1, s2) -> {
			
		//});
		c = 0;
		
		while(c < n) {
	//		bw.write(arr[c] + "\n");
			c = c + 1;
		}
		bw.close();
	}

}
