package edu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Q10828 {
	static ArrayList<Integer> stack = new ArrayList<>();
	
	public static void push(int num) {
		stack.add(num);
	}
	
	public static void pop() {
		if(stack.isEmpty()) System.out.println("-1");
		else {
			int i = stack.size() - 1;
			System.out.println(stack.get(i));
			stack.remove(i);
		}
	}
	
	public static void size() {
		System.out.println(stack.size());
	}
	
	public static void empty() {
		if(stack.isEmpty()) System.out.println("1");
		else System.out.println("0");
	}
	
	public static void top() {
		if(stack.isEmpty()) System.out.println("-1");
		else System.out.println(stack.get(stack.size()-1));
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
				case "pop": pop();
							break;
				case "size": size();
							break;
				case "empty": empty();
							break;
				case "top": top();
							break;
			}
		}

	}

}
