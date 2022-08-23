package edu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q1712 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int A, B, C;
		
		String[] str = br.readLine().split(" ");
		A = Integer.parseUnsignedInt(str[0]);
		B = Integer.parseUnsignedInt(str[1]);
		C = Integer.parseUnsignedInt(str[2]);

		if(B>=C) bw.write("-1");
		else {
			bw.write(Integer.toUnsignedString((A/(C-B))+1));
		}
		
		bw.close();
	}

}
