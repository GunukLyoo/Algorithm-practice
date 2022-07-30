package edu;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q8393 {

	public static void main(String[] args) throws Exception {
		int n;
		int sum = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.parseInt(br.readLine());
		
		for(int i = 1; i <= n; i++) {
			sum = sum + i;
		}
		System.out.println(sum);

	}

}
