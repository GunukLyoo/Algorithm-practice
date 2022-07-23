package edu;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q1330 {

	public static void main(String[] args) throws Exception {
		int x, y;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String arr[] = br.readLine().split(" ");
		x = Integer.parseInt(arr[0]);
		y = Integer.parseInt(arr[1]);
		
		if (x > y) System.out.println(">");
		else if (x < y) System.out.println("<");
		else System.out.println("==");
	}

}
