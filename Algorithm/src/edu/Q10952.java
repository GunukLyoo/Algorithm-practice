package edu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q10952 {

	public static void main(String[] args) throws Exception {
		int x, y;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] arr = br.readLine().split(" ");
		x = Integer.parseInt(arr[0]);
		y = Integer.parseInt(arr[1]);
		
		while(x != 0 && y != 0) {
			bw.write((x+y) + "\n");
			bw.flush();
			arr = br.readLine().split(" ");
			x = Integer.parseInt(arr[0]);
			y = Integer.parseInt(arr[1]);
		}
		br.close();
	}

}
