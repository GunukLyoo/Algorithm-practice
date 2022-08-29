package edu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q2775 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		int c = 0;
		int sum = 0;
		int maxk, maxn;
		
		int[][] target = new int[n][2];
		
		while(c<n) {
			target[c][0] = Integer.parseInt(br.readLine());
			target[c][1] = Integer.parseInt(br.readLine());
			c = c + 1;
		}
		c = 1;
		maxk = target[0][0];
		maxn = target[0][1];
		
		while(c<n) {
			if(maxk < target[c][0]) maxk = target[c][0];
			if(maxn < target[c][1]) maxn = target[c][1];
			c = c + 1;
		}

		int[][] table = new int[maxk+1][maxn+1];
		
		for(int i = 0; i < maxn+1; i++) {
			table[0][i] = i+1;
		}
		
		c = 0;
		
		while(c<maxk) {
			for(int i = 0; i< maxn+1; i++) {
				sum = sum + table[c][i];
				table[c+1][i] = sum;
			}
			sum = 0;
			c = c + 1;
		}
		
		for(int i = 0; i < maxk+1; i++) {
			for(int j = 0; j < maxn+1; j++) {
				bw.write(Integer.toString(table[i][j]) + " ");
			}
			bw.write("\n");
		}
		
		c = 0;
		while(c<n) {
			bw.write(Integer.toString(target[c][0]) + " " + Integer.toString(target[c][1]-1) + " ");
			bw.write(Integer.toString(table[target[c][0]][target[c][1]-1]) + "\n");
			c = c + 1;
		}
		
		
		bw.close();
	}

}
