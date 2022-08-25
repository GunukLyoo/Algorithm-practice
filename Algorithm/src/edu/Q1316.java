package edu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Q1316 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		boolean[] end = new boolean[26];
		int count = 0;
		int n = 0;
		int c = 0;
		boolean check = true;
		char[] str;
		
		n = Integer.parseInt(br.readLine());
		
		while(c < n) {
			str = br.readLine().toCharArray();
			Arrays.fill(end, false);
			for(int i = 1; i < str.length; i++) {
				if(str[i-1] == str[i]) ;
				else {
					if(end[(byte)str[i]-97] == true) {
						check = false;
						break;
					}
					else if(end[(byte)str[i]-97] == false) {
						end[(byte)str[i-1]-97] = true;
					}
				}
			}
			if(check == true) count = count + 1;
			else check = true;
			c = c + 1;
		}
		
		bw.write(Integer.toString(count));
		bw.close();
	}

}
