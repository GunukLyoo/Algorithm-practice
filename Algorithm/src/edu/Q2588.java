package edu;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q2588 {

	public static void main(String[] args) throws Exception {
		int x, a, b, c;
		int sum = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		x = Integer.parseInt(br.readLine());
		String str[] = br.readLine().split("");
		a = x*Integer.parseInt(str[2]);
		b = x*Integer.parseInt(str[1]);
		c = x*Integer.parseInt(str[0]);
		
		sum = a + b*10 + c*100;
		
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(sum);
	}

}
