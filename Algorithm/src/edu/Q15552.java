package edu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q15552 {

	public static void main(String[] args) throws Exception {
		int n;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		n = Integer.parseInt(br.readLine());
		String[] arr;
		
		for(int i = 0; i < n; i++) {
			arr = br.readLine().split(" ");
			bw.write(Integer.parseInt(arr[0]) + Integer.parseInt(arr[1]) + "\n");
			bw.flush();
		}
		bw.close();
	}

}
