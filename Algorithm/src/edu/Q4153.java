package edu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q4153 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int[] tri = new int[3];
		int max = 0;
		int left = 0;
		int right = 0;
		
		String[] str = br.readLine().split(" ");
		tri[0] = Integer.parseInt(str[0]);
		tri[1] = Integer.parseInt(str[1]);
		tri[2] = Integer.parseInt(str[2]);
		while(tri[0]*tri[1]*tri[2]!=0) {
			left = 0;
			right = 0;
			max = 0;
			for(int i = 0; i < 3; i++) {
				if(max<tri[i]) max = tri[i];
			}
			for(int i = 0; i < 3; i++) {
				if(max != tri[i]) left = left + tri[i]*tri[i];
			}
			right = max * max;
			
			if(left == right) bw.write("right\n");
			else bw.write("wrong\n");
			
			str = br.readLine().split(" ");
			tri[0] = Integer.parseInt(str[0]);
			tri[1] = Integer.parseInt(str[1]);
			tri[2] = Integer.parseInt(str[2]);
		}
		bw.close();
	}

}
