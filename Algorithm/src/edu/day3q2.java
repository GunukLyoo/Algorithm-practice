package edu;

import java.util.Random;
import java.util.Scanner;

public class day3q2 {
	
	public static int countSnum(int n, int s, int c) {
		int count = c;
		int result = 0;

		if((n/10)==0) {
			if((n%10)==s)
				count = c+1;
			return count;
		}
		else if((n/10)>0) {
			if((n%10)==s)
				count=c+1;
			
			result = countSnum(n/10, s, count);
			
		}
		
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 0;
		int s = 0;
		int count = 0;
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		
		n = rand.nextInt(Integer.MAX_VALUE);
		
		System.out.println("이 프로그램은 랜덤한 양의 정수를 생성하여 입력한 숫자(0~9)가 그 정수내에 몇번 나타났는지를 구하는 프로그램입니다.");
		System.out.println("숫자를 입력하여 주십시오");
		s = sc.nextInt();
		while(s<0 || s>9) {
			System.out.println("조건에 맞는 수가 아닙니다. 다시 입력하여 주십시오");
			s = sc.nextInt();			
		}
		
		count = countSnum(n, s, 0);
		System.out.println("랜덤한 양의 정수 " + n + " 에 나타난 " + s + " 의 개수는 " + count + " 개 입니다.");
	}

}
