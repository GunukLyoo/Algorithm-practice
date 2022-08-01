package edu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q8958 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int sum;
		int sc;
		int n;
		int i = 0;
		
		n = Integer.parseInt(br.readLine());
		String[] arr;
		
		while(i<n) {
			i = i + 1;
			sc = 0;
			sum = 0;
			arr = br.readLine().split("");
			for(int j = 0; j < arr.length; j++) {
				if(arr[j].equals("O")) {
					sc = sc + 1;
					sum = sum + sc;
				}
				else sc = 0;
			}
			
			bw.write(Integer.toString(sum) + "\n");
			bw.flush();
		}

	}

}
