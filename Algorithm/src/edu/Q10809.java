package edu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Q10809 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int[] a = new int[26];
		
		Arrays.fill(a, -1);
		char[] str = br.readLine().toCharArray();
		
		for(int i = 0; i < str.length; i++) {
			if(a[(byte)str[i]-97] == -1) a[(byte)str[i]-97] = i;
		}
		
		for(int i = 0; i <a.length; i++) {
			bw.write(Integer.toString(a[i]) + " ");
		}
		bw.close();

	}

}
