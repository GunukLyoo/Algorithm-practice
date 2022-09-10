package edu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q3036 {
	
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

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		int f = 0;
		String[] arr = br.readLine().split(" ");
		
		for(int i = 1; i < n; i++) {
			f = factor(Integer.parseInt(arr[0]), Integer.parseInt(arr[i]));
			bw.write(Integer.toString(Integer.parseInt(arr[0]) / f) + "/" + Integer.toString(Integer.parseInt(arr[i]) / f) + "\n");
		}
		bw.close();

	}

}
