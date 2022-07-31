package edu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Q3052 {

	public static void main(String[] args) throws Exception {
		int[] x = new int[10];
		int[] r = new int[10];
		Boolean[] b = new Boolean[10];
		int c = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		Arrays.fill(b, true);
		
		for(int i = 0; i < 10; i++) {
			x[i] = Integer.parseInt(br.readLine());
			r[i] = x[i] % 42;
		}
		
		for(int i = 0; i < 10 ; i++) {
			if(b[i] == true) {
				for(int j = i+1; j < 10; j++) {
					if(r[i] == r[j]) b[j] =false;
				}
				c = c + 1;
			}
		}
		
		bw.write(c + "\n");
		bw.close();
	}

}
