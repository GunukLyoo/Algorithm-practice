package edu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q2908 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] str = br.readLine().split(" ");
		int n1;
		int n2;
		
		StringBuffer sb = new StringBuffer(str[0]);
		n1 = Integer.parseInt(sb.reverse().toString());
		sb = new StringBuffer(str[1]);
		n2 = Integer.parseInt(sb.reverse().toString());
		
		if(n1 > n2) bw.write(Integer.toString(n1));
		else bw.write(Integer.toString(n2));

		bw.close();
	}

}
