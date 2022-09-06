package edu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q1934 {
	
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
		int c = 0;
		int a, b;
		String[] arr;
		
		while(c<n) {
			arr = br.readLine().split(" ");
			a = Integer.parseInt(arr[0]);
			b = Integer.parseInt(arr[1]);
			if(a > b) bw.write(Integer.toString(a * b / factor(a, b)) + "\n");
			else bw.write(Integer.toString(b * a / factor(b, a)) + "\n");
			c = c + 1;
		}
		bw.close();
	}

}
