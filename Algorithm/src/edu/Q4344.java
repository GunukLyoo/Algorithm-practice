package edu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q4344 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n, m;
		int c = 0;
		int count = 0;
		int sum = 0;
		float scavg, stavg;
		String[] str;
		
		n = Integer.parseInt(br.readLine());
		
		while(c<n) {
			str = br.readLine().split(" ");
			m = Integer.parseInt(str[0]);
			for(int i = 1; i <= m; i++) {
				sum = sum + Integer.parseInt(str[i]);
			}
			scavg = sum / m;
			for(int i = 1; i <= m; i++) {
				if(Integer.parseInt(str[i]) > scavg) count = count + 1;
			}
			stavg = (float)count/m*100;
			bw.write(String.format("%.3f", stavg) + "%\n");
			sum = 0;
			count = 0;
			c = c + 1;
		}
		bw.close();
	}
}
