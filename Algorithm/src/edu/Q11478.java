package edu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;

public class Q11478 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int count = 0;
		int n = 1;
		
		String[] str = br.readLine().split("");
		String str1 = "";
		HashMap<String, String> A = new HashMap<>();
		
		while(n<=str.length) {
			for(int i = 0; i < str.length; i++) {
				for(int j = i; j < i + n && i + n <= str.length; j++) {
					str1 = str1 + str[j];
				}
				A.put(str1, str1);
				str1 = "";
			}
			n = n + 1;
		}
		
		bw.write(Integer.toString(A.size()-1));
		bw.close();
	}

}
