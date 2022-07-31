package edu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Q1110 {

	public static void main(String[] args) throws Exception {
		int c = 0;
		int start;
		int x = 0;
		int y;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] arr;
		String[] arr1;
		start = Integer.parseInt(br.readLine());
		
		while(start != x) {
			if(c==0) arr = Integer.toString(start).split("");
			else arr = Integer.toString(x).split("");
			y = Integer.parseInt(arr[0])+Integer.parseInt(arr[1]);
			if(y>=10) {
				arr1 = Integer.toString(y).split("");
				x = Integer.parseInt(arr[1]) * 10 + Integer.parseInt(arr1[1]) ;
			}
			else {
				arr1 = ("0" + Integer.toString(y)).split("");
				x = Integer.parseInt(arr[1]) * 10 + Integer.parseInt(arr1[1]);
			}
			c = c + 1;
			bw.write(arr[0]+ arr[1] + " " + arr1[0] + arr1[1] + "\n");
			bw.flush();
		}
		bw.write(c + "\n");	
		bw.close();
	}
}
