package edu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q1193 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = 0;
		int x = 0;
		int k = 0;
		
		n = Integer.parseInt(br.readLine());

		while((x-1)*x/2 < n) {
			x = x + 1;
		}
		
		x = x -1;
		k = n - (x-1)*x/2;
		
		if(x%2 == 0) {
			bw.write(Integer.toString(k) + "/" + Integer.toString(x-k+1));
		}else {
			bw.write(Integer.toString(x-k+1) + "/" + Integer.toString(k));
		}
		bw.close();
	}

}
