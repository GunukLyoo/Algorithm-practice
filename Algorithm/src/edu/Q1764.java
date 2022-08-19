package edu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashMap;

public class Q1764 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n,m;
		int c = 0;
		int count = 0;
		String search;
		
		String[] str = br.readLine().split(" ");
		n = Integer.parseInt(str[0]);
		m = Integer.parseInt(str[1]);
		HashMap<String, Boolean> friend = new HashMap<>();
		HashMap<String, Boolean> nfriend = new HashMap<>();
		
		while(c<n) {
			friend.put(br.readLine(), true);
			c = c + 1;
		}
		
		c = 0;
		while(c<m) {
			search = br.readLine();
			if(friend.containsKey(search)){
				count = count + 1;
				nfriend.put(search, true);
			}
			c = c + 1;			
		}
		
		Object[] list = nfriend.keySet().toArray();
		Arrays.sort(list);
		
		bw.write(Integer.toString(count) + "\n");
		for(int i = 0; i < list.length; i++) {
			bw.write(list[i] + "\n");
		}
		bw.close();
	}

}
