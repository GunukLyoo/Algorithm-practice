package edu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q14425 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n,m;
		int c = 0;
		int count = 0;
		
		String[] str = br.readLine().split(" ");
		n = Integer.parseInt(str[0]);
		m = Integer.parseInt(str[1]);
		String[] arr = new String[n];
		String[] arr1 = new String[m];
		
		while(c<n) {
			arr[c] = br.readLine();
			c = c + 1;
		}
		
		c = 0;
		
		while(c<m) {
			arr1[c] = br.readLine();
			c = c + 1;
		}
		
		c = 0;

		while(c<m) {
			for(int i = 0; i < n; i++) {
				if(arr1[c].equals(arr[i])) {
					count = count + 1;
					break;
				}
			}
			c = c + 1;
		}
		
		bw.write(Integer.toString(count));
		bw.close();
	}

}
