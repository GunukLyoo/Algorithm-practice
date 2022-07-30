package edu;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q2739 {

	public static void main(String[] args) throws Exception {
		int x;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		x = Integer.parseInt(br.readLine());
		
		for(int i = 1; i<=9; i++) {
			System.out.println(x + " X " + i + " = " + (x*i));
		}
	}

}
