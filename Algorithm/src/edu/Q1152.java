package edu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q1152 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String c;
		
		String[] arr = br.readLine().split(" ");
		if(arr[0].equals("")) c = Integer.toString(arr.length-1);
		else c = Integer.toString(arr.length);		
	
		bw.write(arr[1]);
		bw.close();
	}
}
