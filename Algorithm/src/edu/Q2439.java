package edu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q2439 {

	public static void main(String[] args) throws Exception {
		int n;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		n = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(j<n-(i+1)) bw.write(" ");
				else bw.write("*");
			}
			bw.write("\n");
		}
		bw.close();

	}

}
