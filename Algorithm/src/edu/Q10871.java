package edu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q10871 {

	public static void main(String[] args) throws Exception {
		int n, x;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] arr = br.readLine().split(" ");
		n = Integer.parseInt(arr[0]);
		x = Integer.parseInt(arr[1]);
		
		arr = br.readLine().split(" ");
		
		for(int i = 0; i < n; i++) {
			if(Integer.parseInt(arr[i]) < x) bw.write(arr[i] + " ");
		}
		bw.close();

	}

}
