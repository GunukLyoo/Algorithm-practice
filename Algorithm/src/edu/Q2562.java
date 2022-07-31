package edu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q2562 {

	public static void main(String[] args) throws Exception {
		int[] arr = new int[9];
		int max = 0, maxi = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		for(int i = 0; i < 9; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			if(max<arr[i]) {
				max = arr[i];
				maxi = i;
			}
		}
		
		bw.write(Integer.toString(max) + "\n");
		bw.write(Integer.toString(maxi+1) + "\n");
		bw.close();
	}

}
