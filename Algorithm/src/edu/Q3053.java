package edu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q3053 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int r;
		double U = 0, T = 0;
		
		r = Integer.parseInt(br.readLine());
		U = Math.PI * r * r;
		T = 2 * r * r;
		
	//	bw.write(Double.toString(U) + "\n" + Double.toString(T));
		bw.write(String.format("%.6f", U) + "\n" + String.format("%.6f", T));
		bw.close();
	}

}
