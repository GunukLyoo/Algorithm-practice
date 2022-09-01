package edu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Q4948 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		boolean[] isPrime = new boolean[246913];
		Arrays.fill(isPrime, true);
		isPrime[0] = false;
		isPrime[1] = false;
		for(int i = 2; i*i <= 246913; i++) {
			if(isPrime[i]) {
				for(int j = i*i; j <= 246913; j+=i) {
					isPrime[j] = false;
				}
			}
		}
		
		int count = 0;
		int n = Integer.parseInt(br.readLine()); 

		while(n!=0) {
			for(int i = n + 1; i <= 2 * n; i++) {
				if(isPrime[i]) count = count + 1;
			}
			bw.write(Integer.toString(count) + "\n");
			count = 0;
			n = Integer.parseInt(br.readLine());
		}
		bw.close();
	}

}
