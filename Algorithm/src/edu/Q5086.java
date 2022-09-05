package edu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q5086 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n, m;
		
		String[] arr = br.readLine().split(" ");
		n = Integer.parseInt(arr[0]);
		m = Integer.parseInt(arr[1]);
		
		while(n != 0 && m != 0) {
			if(m%n == 0) bw.write("factor\n");
			else if(n%m == 0) bw.write("multiple\n");
			else if(m%n != 0 && n%m != 0)bw.write("neither\n");
			
			arr = br.readLine().split(" ");
			n = Integer.parseInt(arr[0]);
			m = Integer.parseInt(arr[1]);
		}
		bw.close();
	}

}
