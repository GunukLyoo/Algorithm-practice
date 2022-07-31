package edu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q2577 {

	public static void main(String[] args) throws Exception {
		int[] x = new int[3];
		int sum = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		for(int i = 0; i < 3; i++) {
			x[i] = Integer.parseInt(br.readLine());
		}
		
		sum = x[0] * x[1] * x[2];
		
		String[] arr = Integer.toString(sum).split("");
		int[] c = new int[10];
		
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < arr.length ; j++) if(Integer.parseInt(arr[j]) == i) c[i] = c[i] + 1;
			
			bw.write(c[i] + "\n");
			bw.flush();
		}
		
		bw.close();

	}

}
