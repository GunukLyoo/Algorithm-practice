package edu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q2559 {
	
	static int xtoy(int[] arr, int m, int total)  {
		int sum = 0;
		int max = 0;
		int x = 0;
		int y = m-1;
		
		/*if(m <= arr.length/2) {
			while(y <= arr.length) {
				for(int i = x; i < y; i++) {
					sum = sum + arr[i];
				}
				if(x == 0) max = sum;
				else if(max < sum) max = sum;
				x = x + 1;
				y = y + 1;
				sum = 0;
			}
			return max;
		}else {
			while(y <= arr.length) {
				if(x != 0) {
					for(int i = 0; i < x; i++) {
						sum += arr[i];
					}
				}			
			
				if(y != arr.length) {
					for(int i = y; i < arr.length; i++) {
						sum += arr[i];
					}
				}
				
				if(x == 0) max = sum;
				else if(max < total - sum) max = total - sum;
				x = x + 1;
				y = y + 1;
				sum = 0;
			}
			return max;
		}*/
		for(int i = x; i <= y; i++) {
			sum = sum + arr[i];
		}
		max = sum;
		x = x + 1;
		y = y + 1;
		while(y < arr.length) {
			sum = sum - arr[x-1] + arr[y];
			if(max < sum) max = sum;
			x = x + 1;
			y = y + 1;
		}
		return max;
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] arr = br.readLine().split(" ");
		int n = Integer.parseInt(arr[0]);
		int m = Integer.parseInt(arr[1]);
		int[] arrn = new int[n];
		int total = 0;
		
		arr = br.readLine().split(" ");
		for(int i = 0; i < n; i++) {
			arrn[i] = Integer.parseInt(arr[i]);
			total = total + arrn[i];
		}
		
		bw.write(Integer.toString(xtoy(arrn, m, total)));
		bw.close();
	}

}
