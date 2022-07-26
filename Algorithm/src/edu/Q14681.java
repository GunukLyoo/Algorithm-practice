package edu;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q14681 {

	public static void main(String[] args) throws Exception {
		int x,y;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		x = Integer.parseInt(br.readLine());
		y = Integer.parseInt(br.readLine());

		if(x>0) {
			if(y>0) System.out.println("1");
			else if (y<0) System.out.println("4");
		}
		else if(x<0) {
			if(y>0) System.out.println("2");
			else if (y<0) System.out.println("3");
		}
	}

}
