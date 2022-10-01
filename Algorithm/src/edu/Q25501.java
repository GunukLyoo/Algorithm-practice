package edu;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q25501 {
	
	public static int recursion(String s, int l, int r, int count){
        if(l >= r) {
        	System.out.println("1 " + count);
        	return 1;
        }
        else if(s.charAt(l) != s.charAt(r)) {
        	System.out.println("0 " + count);
        	return 0;
        }
        else return recursion(s, l+1, r-1, count + 1);
    }
    public static int isPalindrome(String s){
    	int count = 0;
        return recursion(s, 0, s.length()-1, count + 1);
    }

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < n ; i++) {
			isPalindrome(br.readLine());
		}
	}

}
