package edu;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q10430 {

	public static void main(String[] args) throws Exception {
		int A, B, C;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String arr[] = br.readLine().split(" ");
		A = Integer.parseInt(arr[0]);
		B = Integer.parseInt(arr[1]);
		C = Integer.parseInt(arr[2]);
		
		System.out.println((A+B)%C);
		System.out.println(((A%C) + (B%C))%C);
		System.out.println((A*B)%C);
		System.out.println(((A%C) * (B%C))%C);
	}

}
