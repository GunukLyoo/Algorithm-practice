package edu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Q18870 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		Integer[] arr = new Integer[n];
		String[] arrs = br.readLine().split(" ");
		
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(arrs[i]);
		}
		
		Set<Integer> set = new HashSet<Integer>(Arrays.asList(arr));
		Integer[] arrc = set.toArray(new Integer[0]);
		
		Arrays.sort(arrc);
		
		for(int i = 0; i < n; i++) {
			bw.write(Integer.toString(Arrays.asList(arrc).indexOf(arr[i])) + " ");
		}
		bw.close();
	}

}
