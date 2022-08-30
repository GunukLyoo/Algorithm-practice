package edu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Q2581 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		boolean[] prime = new boolean[10001];
		int min = 0;
		int sum = 0;
		int m,n;
		
		Arrays.fill(prime, true);
		prime[0] = false;
		prime[1] = false;
		
		for(int i = 2; i*i <= 10000; i++) {
			if(prime[i]) {
				for(int j = i*i; j<=10000; j+=i) {
					prime[j] = false;
				}
			}
		}

		m = Integer.parseInt(br.readLine());
		n = Integer.parseInt(br.readLine());
		
		for(int i = m; i<=n; i++) {
			if(prime[i] == true && min == 0) {
				min = i;
				sum = sum + i;
			}else if(prime[i] == true) sum = sum + i;
		}
		
		if(sum == 0) {
			bw.write("-1");
		}else {
			bw.write(Integer.toString(sum) + "\n" + Integer.toString(min));
		}
		bw.close();
	}

}
