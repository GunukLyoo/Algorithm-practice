package edu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q11022 {
	public static void main(String[] args) throws Exception {
		int n;
		int x,y;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		n = Integer.parseInt(br.readLine());
		String[] arr;
				
		for(int i = 1; i <= n; i++) {
			arr = br.readLine().split(" ");
			x = Integer.parseInt(arr[0]);
			y = Integer.parseInt(arr[1]);
			bw.write("Case #" + i + ": " + x + " + " + y + " = " + (x + y) + "\n");
		}
		bw.close();
	}

}
