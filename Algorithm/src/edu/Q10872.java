package edu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q10872 {
	
	static int factorial(int total, int max, int n) {
		int ft = total;
		if(max >= n) {
			ft = factorial(total*n, max, n + 1);
		}
		
		return ft;
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		int total = 0;
		
		if(n == 0) {
			total = 1;
		}else {
			total = factorial(1, n, 1);
		}

		bw.write(Integer.toString(total));
		bw.close();
	}

}
