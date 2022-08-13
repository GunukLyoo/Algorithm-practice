package edu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Q10814 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n;
		int c = 0;
		
		n = Integer.parseInt(br.readLine());
		int[] num = new int[n];
		String[][] arr = new String[n][2];
		String[][] result = new String[n][2];
		String[] str;
		
		while(c<n) {
			str = br.readLine().split(" ");
			arr[c][0] = str[0];
			arr[c][1] = str[1];
			num[c] = Integer.parseInt(str[0]);
			c = c + 1;
		}
		
		Arrays.sort(num);
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(num[i] == Integer.parseInt(arr[j][0])) {
					result[i][0] = arr[j][0];
					result[i][1] = arr[j][1];
					arr[j][0] = "300";
					break;
				}
			}
		}
		
		/*c = 0;
		
		while(c<n) {
			min = Integer.parseInt(arr[0][0]);
			mini = 0;
			for(int j = 1; j < n; j++) {
				if(min > Integer.parseInt(arr[j][0])) {
					min = Integer.parseInt(arr[j][0]);
					mini = j;
				}
			}
			result[c][0] = arr[mini][0];
			result[c][1] = arr[mini][1];
			arr[mini][0] = "300";
			c = c + 1;
		}*/
		
		c = 0;
		
		while(c<n) {
			bw.write(result[c][0] + " " + result[c][1] + "\n");
			c = c + 1;
		}		

		bw.close();
	}

}
