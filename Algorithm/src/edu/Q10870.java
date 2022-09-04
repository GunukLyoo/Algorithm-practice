package edu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q10870 {

	static int fibo(int[] Fn, int n, int c) {
		int fn = 0;
		
		if(c <= n) {
			Fn[c] = Fn[c-2] + Fn[c-1];
			fn = fibo(Fn, n, c + 1);
		}else {
			fn = Fn[n];
		}
		
		return fn;
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		int fn;
		int[] Fn = new int[n + 1];
		
		
		
		if(n == 0) bw.write("0");
		else if(n == 1) bw.write("1");
		else {
			Fn[0] = 0;
			Fn[1] = 1;
			fn = fibo(Fn, n, 2);
			bw.write(Integer.toString(fn));
		}
		bw.close();
	}
}
