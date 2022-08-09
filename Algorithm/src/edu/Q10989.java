package edu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Q10989 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n;
		int c = 0;
		int x;
		
		n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		int[] result = new int[n];
		int[] counting = new int[10001];
		
		while(c<n) {
			arr[c] = Integer.parseInt(br.readLine());
			c = c + 1;
		}
		
		c = 0;
		Arrays.fill(result, 0);
		Arrays.fill(counting, 0);
		
		while(c<n) {
			counting[arr[c]] = counting[arr[c]] + 1;
			c = c + 1;
		}
		
		c = 1;
		
		while(c<counting.length) {
			counting[c] = counting[c] + counting[c-1];
			c = c +1;
		}
		bw.flush();
		
		for(int i = n-1; i >= 0; i--) {
			counting[arr[i]] = counting[arr[i]] -1;
			x = counting[arr[i]];
			result[x] = arr[i];
		}
		
		for(int i = 0; i < n; i++) {
			bw.write(Integer.toString(result[i]) + "\n");
		}
		bw.close();
		
	}

}