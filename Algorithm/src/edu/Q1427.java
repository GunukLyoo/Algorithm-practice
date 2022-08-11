package edu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Q1427 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int sum = 0;;
		
		String[] arr = br.readLine().split("");
		int[] num = new int[arr.length];
		for(int i = 0; i < arr.length; i++) {
			num[i] = Integer.parseInt(arr[i]);
		}
		
		Arrays.sort(num);
		
		for(int i = 0; i < arr.length; i++) {
			
			sum = sum + num[i] * (int)Math.pow(10, i);
		}
		
		bw.write(Integer.toString(sum));
		bw.close();

	}

}
