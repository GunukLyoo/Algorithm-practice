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
		int[] sum = new int[m];
		int s = 0;
		int count = 0;
		
		arr = br.readLine().split(" ");
		for(int i = 0; i < n; i++) {
			arrn[i] = Integer.parseInt(arr[i]);
			s = (s + arrn[i]) % m;
			sum[s%m]++;
		}
		
		count = sum[0];
		for(int i = 0; i < m; i++) {
			count += (long) sum[i] * (sum[i]-1) / 2;
		}
		
		bw.write(Integer.toString(count));
		bw.close();
	}

}
