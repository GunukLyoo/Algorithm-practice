package edu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Q11660 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] arr = br.readLine().split(" ");
		int n = Integer.parseInt(arr[0]);
		int[][] nn = new int[n][n];
		int[][] totalyn = new int[n][n];
		int m = Integer.parseInt(arr[1]);
		int x1, x2, y1, y2;
		int sum = 0;
		int c = 0;
		
		for(int i = 0; i < n; i++) {
			Arrays.fill(totalyn[i], 0);
		}
		
		for(int i = 0; i < n; i++) {
			arr = br.readLine().split(" ");
			for(int j = 0; j < n; j++) {
				nn[i][j] = Integer.parseInt(arr[j]);
				if(c == 0) {
					totalyn[c][j] = nn[i][j];
				}else {
					totalyn[c][j] = totalyn[c-1][j] + nn[i][j];
				}
			
			}
			c = c + 1;
		}
		
		for(int i = 0; i < m; i++) {
			arr = br.readLine().split(" ");
			x1 = Integer.parseInt(arr[0]);
			y1 = Integer.parseInt(arr[1]);
			x2 = Integer.parseInt(arr[2]);
			y2 = Integer.parseInt(arr[3]);
			/*for(int j = y1 - 1; j < y2; j++) {
				for(int k = x1 - 1; k < x2; k++) {
					sum = sum + nn[k][j];
				}
			}*/
			if(x1 == x2 && y1 == y2) {
				sum = nn[x1-1][y1-1];
			}
			else {
			for(int j = x1-1 ; j < x2; j++) {
				if(y1 == 1) {
					sum = sum + totalyn[j][n-1];
				}else {
					sum = sum + totalyn[j][n-1];// - totalyn[j][y2 - 2];
				}
			}
			}
			
			bw.write(Integer.toString(sum) + "\n");
			bw.flush();
			sum = 0;
		}
		bw.close();
	}

}
