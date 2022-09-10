package edu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

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
		int max = 0;
		
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(arr);
		
		for(int i = arr[0]; i >= 0; i--) {
			balance = gcd_n(arr, i);
			if(balance != 1) {
				max = balance;
				break;
			}
		}
		
		for(int i = 2; i <= max; i++) {
			if(max % i == 0) bw.write(Integer.toString(i) + " ");
		}
		bw.close();

	}

}
