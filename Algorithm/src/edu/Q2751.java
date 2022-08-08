package edu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Q2751 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n;
		int c = 0;
		int x;
		
		n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		
		while(c<n) {
			arr[c] = Integer.parseInt(br.readLine());
			c = c + 1;
		}
		
		Arrays.sort(arr);
		
		for(int i = 0; i < n; i++) {
			bw.write(Integer.toString(arr[i]) + "\n");
		}

		bw.close();

	}

}
