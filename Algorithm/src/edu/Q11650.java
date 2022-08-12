package edu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Q11650 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n;
		int c = 0;
		
		n = Integer.parseInt(br.readLine());
		int[][] xy = new int[n][2];
		String[] arr = new String[2];
		
		while(c < n) {
			arr = br.readLine().split(" ");
			xy[c][0] = Integer.parseInt(arr[0]);
			xy[c][1] = Integer.parseInt(arr[1]);
			c = c + 1;
		}
		
		Arrays.sort(xy, (o1, o2) -> {
			if(o1[0] == o2[0]) {
				return Integer.compare(o1[1], o2[1]);
			} else {
				return Integer.compare(o1[0], o2[0]);
			}
		});
		c = 0;
		
		while(c<n) {
			bw.write(Integer.toString(xy[c][0]) + " " + Integer.toString(xy[c][1]) + "\n");
			c = c + 1;
		}
		
		bw.close();
	}

}
