package edu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class Q1181 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n;
		int c = 0;
		
		n = Integer.parseInt(br.readLine());
		String[] arr = new String[n];
		
		while(c < n) {
			arr[c] = br.readLine();
			c = c + 1;
		}
		
		Set<String> arrs = new HashSet<String>(Arrays.asList(arr));
		arr = arrs.toArray(new String[0]);
		
		Arrays.sort(arr, new Comparator<String>() {
			
			public int compare(String s1, String s2) {
				if(s1.length() != s2.length()) {
					return s1.length() - s2.length();
				}else {
					return s1.compareTo(s2);
				}
			}
		});
		c = 0;
		
		while(c < arr.length) {
			bw.write(arr[c] + "\n");
			c = c + 1;
		}
		bw.close();
	}

}
