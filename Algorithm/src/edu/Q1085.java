package edu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q1085 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int x,y,w,h;
		
		String[] str = br.readLine().split(" ");
		x = Integer.parseInt(str[0]);
		y = Integer.parseInt(str[1]);
		w = Integer.parseInt(str[2]);
		h = Integer.parseInt(str[3]);
		int[] len = new int[4];
		len[0] = x;
		len[1] = y;
		len[2] = w-x;
		len[3] = h-y;
		
		int min = len[0];
		
		for(int i = 1; i < 4; i++) {
			if(min>len[i]) min = len[i];
		}
		
		bw.write(Integer.toString(min));
		bw.close();
	}

}
