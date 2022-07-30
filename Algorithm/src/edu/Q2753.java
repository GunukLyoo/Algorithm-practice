package edu;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q2753 {

	public static void main(String[] args) throws Exception {
		int y;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		y = Integer.parseInt(br.readLine());
		
		if(y%4==0 && y%100!=0) System.out.println("1");
		else if(y%4==0 && y%400==0) System.out.println("1");
		else System.out.println("0");
	}

}
