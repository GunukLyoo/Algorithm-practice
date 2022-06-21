package edu;

import java.util.Scanner;

public class Fibonacci {
	
	public static int Fibo(int n) {
		int f1=0;
		int f2=1;
		int x=f1;
		int y=f2;
		int fn=0;
		int count = 1;
		
		System.out.println(count + "번 실행되었습니다.");
		if(n==1) return f1;
		else if(n==2) return f2;
		else if(n>=3) {
			for(int i=3; i<=n; i++) {
				fn=x+y;
				x=y;
				y=fn;
			}
			return fn;
		}
		
		return 0;
	}
	
	public static int FiboRe(int n, int c, int fn, int x, int y, int count) {
		int result=0;
		count++;
		System.out.println("재귀함수가 " + count + "번째 호출중입니다.");
		
		if(n==1) return 0;
		else if(n==2) return 1;
		else if(n>=3) {
			
			
			if(n==c) {
				return fn;
			}
			else {
				fn=x+y;
				x=y;
				y=fn;
				
				result = FiboRe(n, c+1, fn, x, y, count);
			}
		}
		
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=0;
		int fn=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이 프로그램은 1이상의 정수 n을 입력하면 n번째 피보나치 수를 출력하는 프로그램입니다. n을 입력하요 주십시오");
		n=sc.nextInt();
		while(n<1) {
			System.out.println("조건에 맞는 수가 아닙니다. 1이상의 수를 다시 입력해 주세요");
			n=sc.nextInt();
		}
		
		System.out.println("반복문을 이용한 메소드로 " + n + "번째 피보나치 수를 구하기 시작합니다.");
		fn=Fibo(n);
		System.out.println(n+"번째 피보나치 수는 " + fn + "입니다.");
		
		System.out.println();
		
		System.out.println("재귀 메소드로 " + n + "번째 피보나치 수를 구하기 시작합니다.");
		fn = FiboRe(n, 2, 0, 0, 1, 0);
		System.out.println(n+"번째 피보나치 수는 " + fn + "입니다.");
	}

}
