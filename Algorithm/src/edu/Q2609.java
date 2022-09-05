package edu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Q2609 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] arr = br.readLine().split(" ");
		int n = Integer.parseInt(arr[0]);
		int m = Integer.parseInt(arr[1]);
		int maxf = 0;
		int minm;
		boolean[] nf = new boolean[n];
		boolean[] mf = new boolean[m];
		
		Arrays.fill(nf, false);
		Arrays.fill(mf, false);
		
		for(int i = 0; i < n; i++) {
			if(n%(i+1) == 0) nf[i] = true;
		}
		
		for(int i = 0; i < m; i++) {
			if(m%(i+1) == 0) mf[i] = true;
		}
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				if(nf[i] == true && mf[j] == true && i == j) maxf = i + 1;
			}
		}
		
		minm = maxf;
		
		while(minm % n != 0 || minm % m != 0) {
			minm = minm + maxf;
		}
		
		bw.write(Integer.toString(maxf) + "\n");
		bw.write(Integer.toString(minm) + "\n");
		bw.close();

	}

}
