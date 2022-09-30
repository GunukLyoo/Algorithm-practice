package edu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Q18870 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		Integer[] sorted = new Integer[n];
		Integer[] arr = new Integer[n];
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		sorted = arr.clone();
		int id = 0;
		Arrays.sort(sorted);
		
		for(int i : sorted) {
			if(!hm.containsKey(i)) {
				hm.put(i, id);
				id = id + 1;
			}
		}
		
		for(int i : arr) {
			sb.append(hm.get(i)).append(" ");
		}
		bw.write(sb.toString());
		bw.close();
	}

}
