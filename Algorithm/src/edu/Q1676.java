package edu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q1676 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n2 = 0;
		int n5 = 0;
		int x;
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 1; i <= n; i++) {
			x = i;
			while(x % 2 == 0) {
				n2 = n2 + 1;
				x = x % 2;
			}
			
			while(x % 5 == 0) {
				n5 = n5 + 1;
				x = x % 5;
			}
			
		}
		
		if(n2 <= n5) {
			bw.write(Integer.toString(n2));
		}else {
			bw.write(Integer.toString(n5));
		}
		bw.close();
	}

}
