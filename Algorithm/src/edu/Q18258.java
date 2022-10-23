package edu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Q18258 {
	static ArrayList<Integer> stack = new ArrayList<>();
	static StringBuilder sb = new StringBuilder();
	static int count = 0;
	
	public static void push(int num) {
		stack.add(num);
		count++;
	}
	
	public static void pop(BufferedWriter bw){
		if(count == 0) sb.append("-1\n");
		else {
			sb.append(Integer.toString(stack.get(0)) + "\n");
			stack.remove(0);
			count--;
		}
	}
	
	public static void size(BufferedWriter bw){
		sb.append(Integer.toString(count)+ "\n");
	}
	
	public static void empty(BufferedWriter bw){
		if(count == 0) sb.append("1\n");
		else sb.append("0\n");
	}
	
	public static void front(BufferedWriter bw){
		if(count == 0) sb.append("-1\n");
		else sb.append(Integer.toString(stack.get(0))+ "\n");
	}
	
	public static void back(BufferedWriter bw){
		if(count == 0) sb.append("-1\n");
		else sb.append(Integer.toString(stack.get(stack.size()-1))+ "\n");
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		String[] arr;
		
		for(int i = 0; i < n; i++) {
			arr = br.readLine().split(" ");
			switch (arr[0]) {
				case "push": push(Integer.parseInt(arr[1]));
							break;
				case "pop": pop(bw);
							break;
				case "size": size(bw);
							break;
				case "empty": empty(bw);
							break;
				case "front": front(bw);
							break;
				case "back": back(bw);
							break;
			}
		}
		
		bw.write(sb.toString());
		bw.close();
	}
}
