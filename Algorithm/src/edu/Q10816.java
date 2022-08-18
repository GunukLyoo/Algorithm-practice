package edu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashMap;

public class Q10816 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n, m;
		int c = 0;
		int x;
		
		n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		HashMap<Integer, Integer> cmap = new HashMap<>();
		
		String[] str = br.readLine().split(" ");
		while(c<n) {
			arr[c] = Integer.parseInt(str[c]); 
			if(cmap.containsKey(arr[c])) {
				x = cmap.get(arr[c]) + 1;
				cmap.replace(arr[c], x);
			}
			else cmap.put(arr[c], 1);
			c = c + 1;
		}
		Arrays.sort(arr);
		
		c = 0;
		
		m = Integer.parseInt(br.readLine());
		int[] arr1 = new int[m];
		int[] count = new int[m];
		Arrays.fill(count, 0);
		
		str = br.readLine().split(" ");
		while(c<m) {
			arr1[c] = Integer.parseInt(str[c]);
			if(cmap.containsKey(arr1[c])) {
				count[c] = cmap.get(arr1[c]);
			}
			else count[c] = 0;
			c = c + 1;
		}
		
		c = 0;
		
		while(c<m) {
			bw.write(Integer.toString(count[c]) + " ");
			c = c + 1;
		}
		bw.close();
	}

}
