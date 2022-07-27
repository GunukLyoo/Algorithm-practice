package edu;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q2884 {

	public static void main(String[] args) throws Exception {
		int h, m;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] arr = br.readLine().split(" ");
		h = Integer.parseInt(arr[0]);
		m = Integer.parseInt(arr[1]);
		
		if(m>=45) System.out.println(h + " " + (m-45));
		else {
			if(h == 0) System.out.println("23 " + (60+m-45));
			else System.out.println((h-1) + " " + (60+m-45));
		}
	}

}
