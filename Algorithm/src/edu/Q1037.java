package edu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Q1037 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		String[] arr = br.readLine().split(" ");
		int m = 0;
		
		if(n == 1) {
			m = Integer.parseInt(arr[0]);
			bw.write(Integer.toString(m*m));
		}else {
			int[] num = new int[n];
			for(int i = 0; i < n; i++) {
				num[i] = Integer.parseInt(arr[i]);
			}
			Arrays.sort(num);
			m = num[0] * num[n-1];
			bw.write(Integer.toString(m));
		}
		bw.close();
	}

}
