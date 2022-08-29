package edu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q10250 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int H = 0, W = 0, N = 0;
		int x;
		int y;
		int n;
		int c = 0;
		n = Integer.parseInt(br.readLine());
		
		while(c<n) {
			String[] str = br.readLine().split(" ");
			H = Integer.parseInt(str[0]);
			W = Integer.parseInt(str[1]);
			N = Integer.parseInt(str[2]);

			if(N%H == 0) {
				y = H;
				x = N/H;
			}else {
				y = N%H;
				x = N/H + 1;
			}
			
			if(x<10)	bw.write(Integer.toString(y) + "0" + Integer.toString(x) + "\n");
			else bw.write(Integer.toString(y) + Integer.toString(x) + "\n");
			c = c + 1;
		}
		bw.close();
	}

}
