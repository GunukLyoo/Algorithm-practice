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
		int i = 0;
		int n = 0;
		int c = 1;
		
		String str = br.readLine();
		HashMap<String, String> A = new HashMap<>();
		
		while(i < str.length()) {
			while(n < str.length() && n+c <= str.length()) {
				if(A.containsKey(str.substring(n, n+c)) == false){
					A.put(str.substring(n, n+c), str);
				}
				n = n + 1;
			}
			
			n = 0;
			c = c + 1;
			i = i + 1;
		}
		
		bw.write(Integer.toString(A.size()));
		bw.close();
	}

}
