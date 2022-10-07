package edu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;

public class Q4949 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] arr = br.readLine().split("");
		int scount = 0;
		int bcount = 0;
		int x = 0;
		int y = 0;
		boolean check = true;
		ArrayList<String> st = new ArrayList<>();
		
		while(!arr[0].equals(".")) {
			for(String s: arr) {
				if(s.equals("(")) st.add(s);
				else if(s.equals(")")) st.add(s);
				else if(s.equals("[")) st.add(s);
				else if(s.equals("]")) st.add(s);
			}
			
			bw.write(st.toString());
			bw.flush();
			
			x = 0;
			while(x < st.size()-2) {
				y = x + 1;
				if() {
					bw.write(st.get(x) + " " + st.get(x+1));
					bw.flush();
				}
				x = x + 1;
				bw.write(st.toString() + "\n");
				bw.flush();
			}
			
			/*for(char c : arr) {
				if(scount < 0 || bcount<0) break;
				
				if(c == '(') scount = scount + 1;
				else if(c == ')') scount = scount - 1;
				else if(c == '[') bcount = bcount + 1;
				else if(c == ']') bcount = bcount - 1;
			}*/
			
			//if(scount == 0 && bcount == 0) bw.write("YES\n");
			if(check == true) bw.write("YES\n");
			else bw.write("NO\n");
			bw.flush();
			
			scount = 0;
			bcount = 0;
			check = true;
			arr = br.readLine().split("");
			st.clear();
		}
		
		bw.close();
	}
}
