package edu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Q1929 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] arr = br.readLine().split(" ");
		int n = Integer.parseInt(arr[0]);
		int m = Integer.parseInt(arr[1]);
		
		boolean[] isPrime = new boolean[m+1];
		Arrays.fill(isPrime, true);
		isPrime[0] = false;
		isPrime[1] = false;
		
		for(int i = 2; i*i <= m; i++) {
			if(isPrime[i]) {
				for(int j = i*i; j <= m; j+=i) {
					isPrime[j] = false;
				}
			}
		}
		
		for(int i = n; i <= m; i++) {
			if(isPrime[i]) {
				bw.write(Integer.toString(i) + "\n");
			}
		}

		bw.close();
	}

}
