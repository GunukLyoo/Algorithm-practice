package edu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q10986 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] arr = br.readLine().split(" ");
		int n = Integer.parseInt(arr[0]);
		int m = Integer.parseInt(arr[1]);
		int[] arrn = new int[n];
		int count = 0;
		int sum = 0;
		int k = 0;
		int j = 0;
		
		arr = br.readLine().split(" ");
		for(int i = 0; i < n; i++) {
			arrn[i] = Integer.parseInt(arr[i]);
		}

		for(int i = 1; i <= n; i++) {
			
			while(k <= n) {
				
				for(j = k; j < j + i && j + i <= n; j++) {
					sum = sum + arrn[j];
				}
				k = j + i;
				bw.write(Integer.toString(sum) + "\n");
				bw.flush();
			
				if(sum % m == 0) count = count + 1;
			
				sum = 0;
			}
		}
		
		bw.write(Integer.toString(count));
		bw.close();
	}

}
