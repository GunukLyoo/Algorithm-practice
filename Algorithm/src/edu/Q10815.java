package edu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Q10815 {
	
	public static int binarySearch(int[] arr, int x) {
		
		int start= 0;
		int end= arr.length-1;
		int mid= (end+start)/2;

		while(end-start>= 0){
			if(arr[mid]== x){
				return 1;
			}else if(arr[mid]<= x){
	 			start= mid+1;
			}else{
				end= mid-1;
	 		}
	 		mid= (end+start)/2;
	 	}
	 	return 0;
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n;
		int c = 0;
		
		n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		String[] str = br.readLine().split(" ");
		while(c<n) {
			arr[c] = Integer.parseInt(str[c]);
			c = c + 1;
		}
		
		Arrays.sort(arr);
		
		n = Integer.parseInt(br.readLine());
		int[] arr1 = new int[n];
		str = br.readLine().split(" ");
		c = 0;
		while(c<n) {
			arr1[c] = Integer.parseInt(str[c]);
			c = c + 1;
		}
		
		c = 0;
		while(c<n) {
			bw.write(Integer.toString(binarySearch(arr, arr1[c])) + " ");
			c = c + 1;
		}
		bw.close();
	}

}
