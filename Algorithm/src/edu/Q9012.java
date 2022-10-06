package edu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;

public class Q9012 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		ArrayList<String> arr;
		String[] str;
		int count = 0;

		for(int i = 0; i < n; i++) {
			str = br.readLine().split("");
			arr = new ArrayList<>(Arrays.asList(str));
			for(String s : arr) {
				if(count < 0) break;
				
				if(s.equals("(")) count = count + 1;
				else if(s.equals(")")) count = count - 1;
			}
			if(count == 0) bw.write("YES\n");
			else bw.write("NO\n");
			bw.flush();
			
			count = 0;
			arr.clear();
		}
		
		bw.close();
	}

}
