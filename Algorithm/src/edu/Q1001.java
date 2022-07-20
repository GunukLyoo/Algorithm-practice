package edu;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q1001 {

	public static void main(String[] args) throws Exception{
		int A,B;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String arr[] = br.readLine().split(" ");
		A = Integer.parseInt(arr[0]);
		B = Integer.parseInt(arr[1]);

		System.out.println(A-B);
	}

}
