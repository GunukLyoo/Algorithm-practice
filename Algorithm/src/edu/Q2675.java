package edu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q2675 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n;
		int c = 0;
		int x;
		
		n = Integer.parseInt(br.readLine());
		
		while(c<n) {
			String[] arr = br.readLine().split(" ");
			String[] str = arr[1].split("");
			
			for(int i = 0; i < str.length; i++) {
				for(int j = 0; j < Integer.parseInt(arr[0]); j++) {
					bw.write(arr[i]);
				}
			}
			bw.write("\n");
			bw.flush();
			
			c = c + 1;
		}
		
		bw.close();
	}
}
