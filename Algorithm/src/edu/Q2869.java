package edu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q2869 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int A,B,V;
		int count = 0;
		
		String[] str = br.readLine().split(" ");
		A = Integer.parseInt(str[0]);
		B = Integer.parseInt(str[1]);
		V = Integer.parseInt(str[2]);
		
		if((V-B)%(A-B) == 0) {
			count = (int)(V-B)/(A-B);
		}else {
			count = (int)(V-B)/(A-B) + 1;
		}
		
		bw.write(Integer.toString(count));
		bw.close();
	}
}
