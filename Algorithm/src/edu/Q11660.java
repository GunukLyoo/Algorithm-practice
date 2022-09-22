package edu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q11660 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] arr = br.readLine().split(" ");
		int n = Integer.parseInt(arr[0]);
		int[][] nn = new int[n][n];
		int m = Integer.parseInt(arr[1]);
		int x1, x2, y1, y2;
		int sum = 0;
		
		for(int i = 0; i < n; i++) {
			arr = br.readLine().split(" ");
			for(int j = 0; j < n; j++) {
				nn[i][j] = Integer.parseInt(arr[j]);
			}
		}
		
		for(int i = 0; i < m; i++) {
			arr = br.readLine().split(" ");
			x1 = Integer.parseInt(arr[0]);
			y1 = Integer.parseInt(arr[1]);
			x2 = Integer.parseInt(arr[2]);
			y2 = Integer.parseInt(arr[3]);
			for(int j = y1 - 1; j < y2; j++) {
				for(int k = x1 - 1; k < x2; k++) {
					sum = sum + nn[k][j];
				}
			}
			bw.write(Integer.toString(sum) + "\n");
			bw.flush();
			sum = 0;
		}
		bw.close();
	}

}
