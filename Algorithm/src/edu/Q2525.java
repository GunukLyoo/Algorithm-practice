package edu;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q2525 {

	public static void main(String[] args) throws Exception {
		int h, m, t;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] arr = br.readLine().split(" ");
		h = Integer.parseInt(arr[0]);
		m = Integer.parseInt(arr[1]);
		t = Integer.parseInt(br.readLine());
		if(m+t>=60) {
			if((h + (m+t)/60)>=24) System.out.println(((h + (m+t)/60)-24) + " " + (m+t)%60);
			else System.out.println((h + (m+t)/60) + " " + (m+t)%60);
		}
		else System.out.println(h + " " + (m+t));
	}

}
