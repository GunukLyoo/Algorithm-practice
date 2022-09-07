package edu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Q2981 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		boolean c = true;
		int balance = 0;
		
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(arr);
		
		for(int i = 500000000; i >= 2 ; i--) {
			c = true;
			balance = arr[0] % i;
			for(int j = 1; j < n; j++) {
				if(arr[j] % i != balance) {
					c = false;
					break;
				}
				
				
			}
			if(c == true) bw.write(Integer.toString(i) + " ");
		}
		
		bw.close();

	}

}
