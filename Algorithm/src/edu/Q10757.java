package edu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class Q10757 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BigInteger A, B;
		
		String[] str = br.readLine().split(" ");
		A = new BigInteger(str[0]);
		B = new BigInteger(str[1]);
		
		
		
		bw.write(A.add(B).toString());
		bw.close();
	}

}
