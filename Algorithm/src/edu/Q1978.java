package edu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Q1978 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		boolean[] prime = new boolean[1001];
		int n;
		int count = 0;
		
		Arrays.fill(prime, true);
		prime[0] = false;
		prime[1] = false;
		
		for(int i = 2; i*i <= 1000; i++) {
			if(prime[i]) {
				for(int j = i*i; j<=1000; j+=i) {
					prime[j] = false;
				}
			}
		}
		
		n = Integer.parseInt(br.readLine());
		String[] arr = br.readLine().split(" ");
		for(int i = 0; i < arr.length; i++) {
			if(prime[Integer.parseInt(arr[i])] == true) count = count + 1;
		}
		
		bw.write(Integer.toString(count));
		bw.close();
	}

}
