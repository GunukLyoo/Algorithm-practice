package edu;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q1008 {

	public static void main(String[] args) throws Exception{
		double A,B;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String arr[] = br.readLine().split(" ");
		A = Double.parseDouble(arr[0]);
		B = Double.parseDouble(arr[1]);
		
		System.out.println(A/B);
	}

}
