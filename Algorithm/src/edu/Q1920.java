package edu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Q1920 {
	
	static int bins (int[] arr, int target) {		
		int start = 0;
		int end = arr.length-1;		
		int mid = (start + end)/2;
		
		while((end - start) >= 0) {
			if(arr[mid] == target){
				return 1;
			}else if(arr[mid] < target) {
				start = mid + 1;
			}else {
				end = mid - 1;
			}
			mid = (start + end)/2;
		}
		
		return 0;
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		String[] arr = br.readLine().split(" ");
		int[] arrn = new int[n];
		int target;
		
		for(int i = 0; i < n; i++) {
			arrn[i] = Integer.parseInt(arr[i]);
		}
		
		Arrays.sort(arrn);
		
		int m = Integer.parseInt(br.readLine());
		arr = br.readLine().split(" ");
		
		for(int i = 0; i < m; i++) {
			target = Integer.parseInt(arr[i]);
			bw.write(Integer.toString(bins(arrn, target)) + "\n");
			bw.flush();
		}
		
		bw.close();
	}
}
