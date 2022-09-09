package edu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q2798 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] arr = br.readLine().split(" ");
		int n = Integer.parseInt(arr[0]);
		int m = Integer.parseInt(arr[1]);
		int[] arrn = new int[n];
		int sum = 0;
		int minb = m;
		
		arr = br.readLine().split(" ");
		for(int i = 0; i < n; i++) {
			arrn[i] = Integer.parseInt(arr[i]);
		}
		
		for(int i = 0; i < n; i++) {
			for(int j = i + 1; j < n; j++) {
				for(int k = j + 1; k < n; k++) {
					sum = arrn[i] + arrn[j] + arrn[k];
					if(sum <= m && m - sum < minb) minb = m - sum;
				}
			}
		}
		
		bw.write(Integer.toString(m - minb));
		bw.close();
	}

}
