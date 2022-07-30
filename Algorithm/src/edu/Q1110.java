package edu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q1110 {

	public static void main(String[] args) throws Exception {
		int c = 1;
		int start;
		int x = 0;
		int y;
		String bf;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] arr;
		String[] arr1;
		start = Integer.parseInt(br.readLine());
		arr = Integer.toString(start).split("");
		y = Integer.parseInt(arr[0]) + Integer.parseInt(arr[1]);
		if(y>=10) {
			arr = Integer.toString(start).split("");
			arr1 = Integer.toString(y).split("");
			x = Integer.parseInt(arr[1]) * 10 + Integer.parseInt(arr1[1]) ;
		}
		else {
			arr = ("0" + Integer.toString(y)).split("");
			x = Integer.parseInt(arr[1]) * 10 + (Integer.parseInt(arr[0])+Integer.parseInt(arr[1]));
		}
		bw.write(x + "\n");
		bw.flush();
		
		while(start != x) {
			c = c + 1;
			arr = Integer.toString(x).split("");
			y = Integer.parseInt(arr[0])+Integer.parseInt(arr[1]);
			if(y>=10) {
				arr1 = Integer.toString(y).split("");
				x = Integer.parseInt(arr[1]) * 10 + Integer.parseInt(arr1[1]) ;
			}
			else {
				arr = ("0" + Integer.toString(y)).split("");
				x = Integer.parseInt(arr[1]) * 10 + (Integer.parseInt(arr[0])+Integer.parseInt(arr[1]));
			}
			
		}
		bw.write(c + "\n");	
		

	}

}
