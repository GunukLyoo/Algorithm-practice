package edu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q25304 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int sum;
		int c = 0;
		int n;	
		
		sum = Integer.parseInt(br.readLine());
		n = Integer.parseInt(br.readLine());
		String[] str;
		
		while(c<n) {
			str = br.readLine().split(" ");
			sum = sum -(Integer.parseInt(str[0]) * Integer.parseInt(str[1]));
			c = c + 1;
		}
		
		if(sum == 0) bw.write("Yes");
		else bw.write("No");
		
		bw.close();
	}

}
