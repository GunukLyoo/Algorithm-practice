package edu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;

public class Q1269 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n,m;
		int c = 0;
		int count = 0;
		
		String[] str = br.readLine().split(" ");
		n = Integer.parseInt(str[0]);
		m = Integer.parseInt(str[1]);
		HashMap<Integer, Integer> A = new HashMap<>();
		HashMap<Integer, Integer> B = new HashMap<>();
		
		str = br.readLine().split(" ");
		while(c<n) {
			A.put(Integer.parseInt(str[c]), Integer.parseInt(str[c]));
			c = c + 1;
		}

		c = 0;
		
		str = br.readLine().split(" ");
		while(c<m) {
			B.put(Integer.parseInt(str[c]), Integer.parseInt(str[c]));
			c = c + 1;
		}
		
		HashMap<Integer, Integer> clone = (HashMap<Integer, Integer>)A.clone();
		for(int key: B.keySet()) {
			if(clone.containsKey(key)) clone.remove(key); 
		}
		count = count + clone.size();
		
		clone.clear();
		
		clone = (HashMap<Integer, Integer>)B.clone();
		for(int key: A.keySet()) {
			if(clone.containsKey(key)) clone.remove(key); 
		}
		count = count + clone.size();
		
		bw.write(Integer.toString(count) + "\n");
		bw.close();
	}

}
