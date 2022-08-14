package edu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q3003 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int[] result = {1, 1, 2, 2, 2, 8};
		
		String[] str = br.readLine().split(" ");
		int[] c = new int[str.length];
		
		for(int i = 0; i < c.length; i++) {
			c[i] = Integer.parseInt(str[i]);
		}
		
		for(int i = 0; i < c.length; i++) {
			result[i] = result[i] - c[i];
			bw.write(Integer.toString(result[i]) + " ");
		}
		
		bw.close();
	}

}
