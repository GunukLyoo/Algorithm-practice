package edu;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q2480 {

	public static void main(String[] args) throws Exception {
		int[] d = new int[3];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] arr = br.readLine().split(" ");
		d[0] = Integer.parseInt(arr[0]);
		d[1] = Integer.parseInt(arr[1]);
		d[2] = Integer.parseInt(arr[2]);

		if(arr[0].equals(arr[1])) {
			if(arr[0].equals(arr[2])) System.out.println(10000 + Integer.parseInt(arr[0])*1000);
			else System.out.println(1000 + Integer.parseInt(arr[0])*100);
		}
		else {
			if(arr[0].equals(arr[2])) System.out.println(1000 + Integer.parseInt(arr[0])*100);
			else if(arr[1].equals(arr[2])) System.out.println(1000 + Integer.parseInt(arr[1])*100);
			else {
				Arrays.sort(d);
				System.out.println(d[2]*100);
			}
		}
	}

}
