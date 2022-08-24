package edu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Q1157 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int[] a = new int[26];
		int max = 0; 
		int maxi = 0;
		int maxc = 0;
		
		Arrays.fill(a, 0);
		
		char[] str = br.readLine().toCharArray();
		
		for(int i = 0; i < str.length; i++) {
			if((byte)str[i] < 94) a[(byte)str[i]-65] = a[(byte)str[i]-65] + 1;
			else a[(byte)str[i] - 97] = a[(byte)str[i] - 97] + 1;
		}

		max = a[0];
		maxc = 1;
		
		for(int i = 1; i < a.length; i++) {
			if(max == a[i]) {
				maxc = maxc + 1;
			}
			else if(max < a[i]) {
				max = a[i];
				maxi = i;
				maxc = 1;
			}
		}
		
		if(maxc==1) bw.write((char)(maxi+65));
		else bw.write("?");
		
		bw.close();
	}

}
