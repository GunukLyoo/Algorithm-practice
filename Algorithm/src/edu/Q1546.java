package edu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q1546 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n;
		int max = 0;
		float sum = 0;
		float avg;
		
		n = Integer.parseInt(br.readLine());
		
		String[] arr = br.readLine().split(" ");
		
		for(int i = 0; i < n; i++) {
			if(max<Integer.parseInt(arr[i])) max = Integer.parseInt(arr[i]); 
		}
		
		for(int i = 0; i < n; i++) {
			sum = sum + Float.parseFloat(arr[i])/max*100;
		}
		avg = (float)sum/n;
		
		bw.write(Float.toString(avg));
		bw.close();
	}
}
