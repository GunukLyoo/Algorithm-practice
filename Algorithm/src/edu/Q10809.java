package edu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q10809 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] arr = br.readLine().split("");
		int[] arrn = new int[arr.length];
		int[] n = new int[26];
		
		for(int i = 0; i < arr.length; i++) {
			//arrn[i] = Integer.parseInt(arr[i]);
		}
		
		for(int i = 0; i <arr.length; i++) {
			bw.write(Integer.toString(Integer.parseInt(arr[i])) + " ");
		}
		bw.close();

	}

}
