package edu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q11659 {
	
	static int xtoy(int[] arr, int x, int y, int total) {
		int sum = 0;
		
		if(y-x+1 < arr.length/2) {
			for(int i = x-1; i < y; i++) {
				sum = sum + arr[i];
			}
			return sum;
		}else {
			if(x != 1) {
				for(int i = 0; i < x-1; i++) {
					sum += arr[i];
				}
			}
			
			for(int i = y; i < arr.length; i++) {
				sum += arr[i];
			}
			return total - sum;
		}
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] arr = br.readLine().split(" ");
		int n = Integer.parseInt(arr[0]);
		int m = Integer.parseInt(arr[1]);
		int[] arrn = new int[n];
		int x, y;
		int total = 0;
		
		arr = br.readLine().split(" ");
		for(int i = 0; i < n; i++) {
			arrn[i] = Integer.parseInt(arr[i]);
			total += arrn[i];
		}
		
		for(int i = 0; i < m; i++) {
			arr = br.readLine().split(" ");
			x = Integer.parseInt(arr[0]);
			y = Integer.parseInt(arr[1]);
			bw.write(Integer.toString(xtoy(arrn, x, y, total)) + "\n");
			bw.flush();
		}
		bw.close();
	}
}
