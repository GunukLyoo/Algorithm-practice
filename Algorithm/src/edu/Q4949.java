package edu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Q4949 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] arr = br.readLine().split("");
		int x = 0;
		boolean check = true;
		ArrayList<String> st = new ArrayList<>();
		
		while(!arr[0].equals(".")) {
			for(String s: arr) {
				if(s.equals("(")) st.add("1");
				else if(s.equals(")")) st.add("2");
				else if(s.equals("[")) st.add("3");
				else if(s.equals("]")) st.add("4");
			}
			
			if(st.size()%2 == 1) {
				check = false;
			}else {
				x = 0;
				while(st.size()!=0 && x < st.size()-1) {
					if(st.get(x) == "1" && st.get(x+1) == "2") {
						st.remove(x+1);
						st.remove(x);
						if(x!=0) x = x - 1;
					}else if(st.get(x) == "3" && st.get(x+1) == "4") {
						st.remove(x+1);
						st.remove(x);
						if(x!=0) x = x - 1;
					}else if(st.get(x) == "1" && st.get(x+1) == "4") {
						check = false;
						break;
					}else if(st.get(x) == "3" && st.get(x+1) == "2") {
						check = false;
						break;
					}else if(st.get(x) == "2") {
						check = false;
						break;
					}else if(st.get(x) == "4") {
						check = false;
						break;
					}else {
						x = x + 1;
					}
				}
			}

			if(check == true) bw.write("YES\n");
			else bw.write("NO\n");
			bw.flush();
			
			check = true;
			arr = br.readLine().split("");
			st.clear();
		}
		
		bw.close();
	}
}
