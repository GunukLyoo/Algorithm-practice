package edu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q2741 {

	public static void main(String[] args) throws Exception {
		int n;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		n = Integer.parseInt(br.readLine());
		
		for(int i = 1; i <= n; i++) {
			bw.write(i + "\n");
		}
		bw.close();

	}

}
