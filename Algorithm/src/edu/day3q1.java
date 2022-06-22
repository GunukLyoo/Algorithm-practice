package edu;

import java.util.Scanner;

public class day3q1 {
	
	public static int upstair(int n) {
		if(n==0) return 0;
		else if(n==1) return 1;
		else if(n==2) return 2;
		else return upstair(n-1) + upstair(n-2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=0;
		int count=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이 프로그램은 0 이상의 정수 n을 입력받아 한번에 한 계단 혹은 두 계단 씩");
		System.out.println("총 n개의 계단을 오르는 방법의 수를 구하는 프로그램입니다.");
		System.out.println("n을 입력하여 주십시오");
		n = sc.nextInt();
		while(n<0) {
			System.out.println("조건에 맞는 n이 아닙니다. 다시 입력해 주십시오");
			n = sc.nextInt();
		}
		
		count = upstair(n);
		
		System.out.println("n개의 계단을 오르는 방법의 수는 " + count + "가지 입니다.");
	}

}
