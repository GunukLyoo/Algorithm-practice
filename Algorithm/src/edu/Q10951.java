package edu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q10951 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String input;

		String[] arr;
		
		while((input = br.readLine()) != null) {
			arr = input.split(" ");
			bw.write((Integer.parseInt(arr[0])+Integer.parseInt(arr[1])) + "\n");
			bw.flush();
			
		}
		bw.close();
	}

}
