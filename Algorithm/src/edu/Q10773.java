package edu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Q10773 {
	static ArrayList<Integer> stack = new ArrayList<>();

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		int m;
		int sum = 0;
		
		for(int i = 0; i < n; i++) {
			m = Integer.parseInt(br.readLine());
			if(m == 0) {
				stack.remove(stack.size()-1);
			}else {
				stack.add(m);
			}
		}

		for(Integer num : stack) {
			sum = sum + num;
		}
		
		bw.write(Integer.toString(sum));
		bw.close();
	}

}
