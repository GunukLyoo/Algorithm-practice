package edu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Q9020 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		boolean[] isPrime = new boolean[10001];
		Arrays.fill(isPrime, true);
		isPrime[0] = false;
		isPrime[1] = false;
		for(int i = 2; i*i <= 10000; i++) {
			if(isPrime[i]) {
				for(int j = i*i; j <= 10000; j+=i) {
					isPrime[j] = false;
				}
			}
		}
		
		int n = Integer.parseInt(br.readLine());
		int A, B, h;
		
		for(int i = 0; i < n; i++) {
			h = Integer.parseInt(br.readLine())/2;
			A = h;
			B = h;
			if(isPrime[h]) {
				
			}else {			
				while(true) {
					A = A - 1;
					B = B + 1;
					if(isPrime[A] && isPrime[B]) break;
				}
			}
			bw.write(Integer.toString(A) + " " + Integer.toString(B) + "\n");
		}
		bw.close();
		
	}
}
