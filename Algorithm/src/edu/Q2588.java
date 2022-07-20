package edu;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q2588 {

	public static void main(String[] args) throws Exception {
		int x, y;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		x = Integer.parseInt(br.readLine());
		String str[] = br.readLine();
		y = Integer.parseInt(str);
		
		System.out.println(x*Integer.parseInt(str[2]));
		System.out.println();
		System.out.println();
		System.out.println();
	}

}
