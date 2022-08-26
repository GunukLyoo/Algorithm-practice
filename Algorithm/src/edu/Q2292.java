package edu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q2292 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n;
		int c = 1;
		
		n = Integer.parseInt(br.readLine());
		
		if(n == 1) ;
		else {
			while(3*c*c-3*c+2 <= n) {
				c = c + 1;
			}
		}
		
		bw.write(Integer.toString(c));
		bw.close();
	}

}
