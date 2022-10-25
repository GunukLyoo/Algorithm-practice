package edu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q2566 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] str;
		int max = 0;
		int mi = 0;
		int mj = 0;
		
		for(int i = 1; i <= 9; i++) {
			str = br.readLine().split(" ");
			for(int j = 1; j <= 9; j++) {
				if(max < Integer.parseInt(str[j-1])) {
					max = Integer.parseInt(str[j-1]);
					mi = i;
					mj = j;
				}
			}
		}

		bw.write(Integer.toString(max) + "\n" + Integer.toString(mi) + " " + Integer.toString(mj));
		bw.close();
	}

}
