package edu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Q2981 {
	
	static int factor(int a, int b)
	{
	    while (b > 0)
	    {
	        int tmp = a;
	        a = b;
	        b = tmp%b;
	    }
	    return a;
	}
	
	static int gcd_n(int[] arr, int x) {
		int gcd = arr[0] - x;
		
		for(int i = 1; i < arr.length; i++ ) {
			gcd = factor(arr[i] - x, gcd);
		}
		
		return gcd;
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		int balance = 0;
		
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(arr);
		
		List<Integer> arr1 = new ArrayList<Integer>();
		
		for(int i = 0; i <= arr[0]; i++) {
			balance = gcd_n(arr, i);
			if(balance != 1 && arr1.contains(balance) != true) arr1.add(balance);
		}
		
		Collections.sort(arr1);
		
		for(int i = 0; i < arr1.size(); i++) {
			bw.write(Integer.toString(arr1.get(i)) + " ");
		}
		
		bw.close();

	}

}
