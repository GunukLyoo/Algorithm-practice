package edu;

import java.util.Arrays;
import java.util.Scanner;

public class day12q2 {
	
	public static void Dice(int n, int[] D, int c) {
		if(c==n) {
			System.out.println(Arrays.toString(D));
		}else if(c<n) {
			for(int i = 1; i <= 6; i++) {
				D[c] = i;
				Dice(n, D, c+1);
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		int[] D;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이 프로그램은 N(>0)개의 주사위들을 던질때 나올 수 있는 모든 조합들을 출력하는 알고리즘이다.");
		System.out.println("N을 입력하시오");
		n = sc.nextInt();
		while(n<=0) {
			System.out.println("조건에 맞는 값이 아닙니다. 다시 입력하시오");
			n = sc.nextInt();
		}
		
		D = new int[n];
		
		Dice(n, D, 0);
	}

}
