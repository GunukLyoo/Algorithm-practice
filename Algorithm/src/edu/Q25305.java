package edu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Q25305 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n, k;
		
		String[] arr = br.readLine().split(" ");
		n = Integer.parseInt(arr[0]);
		k = Integer.parseInt(arr[1]);
		
		int[] sci = new int[n];
		String[] sc = br.readLine().split(" ");
		
		for(int i = 0; i < n; i++) {
			sci[i] = Integer.parseInt(sc[i]);
		}
		
		Arrays.sort(sci);
		
		bw.write(Integer.toString(sci[n-k]));
		bw.close();
	}

}
