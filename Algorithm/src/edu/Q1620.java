package edu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;

public class Q1620 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n,m;
		int c = 0;
		String search;
		
		
		String[] str = br.readLine().split(" ");
		n = Integer.parseInt(str[0]);
		m = Integer.parseInt(str[1]);
		HashMap<String, String> dic = new HashMap<>();
		HashMap<String, String> dic1 = new HashMap<>();
		
		while(c<n) {
			dic.put(Integer.toString(c+1), br.readLine());
			dic1.put(dic.get(Integer.toString(c+1)), Integer.toString(c+1));
			c = c + 1; 
		}
		c = 0;
		
		while(c<m) {
			search = br.readLine();
			if(dic.get(search) != null) bw.write(dic.get(search) + "\n");
			else {
				bw.write(dic1.get(search) + "\n");
			}
			c = c + 1;
		}
		
		bw.close();
	}

}
