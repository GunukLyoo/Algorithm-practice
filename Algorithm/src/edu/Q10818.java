package edu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q10818 {

	public static void main(String[] args) throws Exception {
		int n;
		int min, max;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		n = Integer.parseInt(br.readLine());
		String[] arr = br.readLine().split(" ");
		min = Integer.parseInt(arr[0]);
		max = Integer.parseInt(arr[0]);
		
		for(int i = 1; i < n; i++) {
			if(min>Integer.parseInt(arr[i])) min = Integer.parseInt(arr[i]);
			if(max<Integer.parseInt(arr[i])) max = Integer.parseInt(arr[i]);
		}
		
		bw.write(min + " " + max + "\n");
		bw.close();
	}

}
