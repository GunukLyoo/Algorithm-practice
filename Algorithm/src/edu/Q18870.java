package edu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Q18870 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		Integer[] arr = new Integer[n];
		ArrayList<Integer> al = new ArrayList<>();
		String[] arrs = br.readLine().split(" ");
		
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(arrs[i]);
			if(al.contains(arr[i]) == false) al.add(arr[i]);
		}
		
		al.sort(null);

		for(int i = 0; i < n; i++) {
			bw.write(Integer.toString(al.indexOf(arr[i])) + " ");
		}
		bw.close();
	}

}
