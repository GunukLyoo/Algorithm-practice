package edu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q11720 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n;
		int sum = 0;
		
		n = Integer.parseInt(br.readLine());
		String[] arr = new String[n];
		
		arr = br.readLine().split("");
		
		for(int i = 0; i < n; i++) {
			sum = sum + Integer.parseInt(arr[i]);
		}
		
		bw.write(Integer.toString(sum));
		bw.close();

	}

}
