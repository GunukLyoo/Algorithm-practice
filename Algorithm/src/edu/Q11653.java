package edu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Q11653 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n;
		int c = 2;
		
		n = Integer.parseInt(br.readLine());
		
		boolean[] prime = new boolean[n+1];
		Arrays.fill(prime, true);
		prime[0] = false;
		prime[1] = false;
		
		for(int i = 2; i * i <= n; i++) {
			if(prime[i]) {
				for(int j = i * i; j <= n; j+=i) {
					prime[j] = false;
				}
			}
		}
		
		while(n!=1) {
			if(n%c == 0) {
				n = n / c;
				bw.write(Integer.toString(c) + "\n");
			}else {
				c = c + 1;
				if(prime[c] == true) ;
				else {
					while(prime[c] != false) {
						c = c + 1;
					}
				}
			}
		}

		bw.close();
	}

}
