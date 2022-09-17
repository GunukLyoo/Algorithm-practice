package edu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q16139 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		char[] arr = br.readLine().toCharArray();
		if(arr.length > 2000) return;
		int n = Integer.parseInt(br.readLine());
		if(n > 2000) return;
		char a;
		int x, y;
		int count = 0;
		String[] arr1;
		
		for(int i = 0; i < n; i++) {
			arr1 = br.readLine().split(" ");
			a = arr1[0].charAt(0);
			x = Integer.parseInt(arr1[1]);
			y = Integer.parseInt(arr1[2]);
			for(int j = x; j <= y; j++) {
				if(a == arr[j]) count = count + 1;
			}
			
			bw.write(Integer.toString(count) + "\n");
			count = 0;
		}
		bw.close();
	}

}
