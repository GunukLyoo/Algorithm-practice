package edu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Q2941 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int i = 0;
		String[] str = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
		int count = 0;
		
		String word = br.readLine();
		
		while(i < word.length()) {
			if(i<word.length()-2 && Arrays.asList(str).contains(word.substring(i, i+3))) {
				count = count + 1;
				i = i + 3;
			}
			else if(i<word.length()-1 && Arrays.asList(str).contains(word.substring(i, i+2))) {
				count = count + 1;
				i = i + 2;
			}
			else {
				count = count + 1;
				i = i + 1;
			}
		}
		
		bw.write(Integer.toString(count));
		bw.close();
	}

}
