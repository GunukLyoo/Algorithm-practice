package edu;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q10950 {

	public static void main(String[] args) throws Exception {
		int n;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.parseInt(br.readLine());
		String[] arr;
		
		for(int i = 0; i < n; i++) {
			arr = br.readLine().split(" ");
			System.out.println(Integer.parseInt(arr[0]) + Integer.parseInt(arr[1]));
		}
	}

}
