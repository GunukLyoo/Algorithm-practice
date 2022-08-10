package edu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q1152 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String c;
		int n;
		
		String[] arr = br.readLine().split(" ");
		n = arr.length;
		if(n!=0) {
			String[] arr1 = new String[n-1];
			if(arr[0].equals("")) {
				for(int i = 1; i < n; i++) {
					arr1[i-1] = arr[i];
				}
				c = Integer.toString(arr1.length);
			}
			else c = Integer.toString(arr.length);
		}
		else {
			c = "0";
		}
	
		bw.write(c + "\n");
		bw.close();
	}
}
