package edu;

import java.util.Arrays;
import java.util.Scanner;

public class day9q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t;
		int max = 0;
		int[] A = {5, 3, 4, 2, 1};
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이 프로그램은 제한 시간 T 내에 끝낼 수 있는 최대 작업 수를 구하는 탐욕 알고리즘을 사용하는 프로그램이다.");
		System.out.println("T를 입력하시오(T>0)");
		t = sc.nextInt();
		while(t<=0) {
			System.out.println("조건에 맞는 T가 아닙니다. 다시 입력해주세요.");
			t = sc.nextInt();
		}
		
		Arrays.sort(A);
		max = getMax(t, A);
		
		System.out.println("제한시간 " + t + " 내에 할 수 있는 최대 작업 수는 " + max + " 이다.");
	}
	
	static int getMax(int t, int[ ] A) {
		int count = 0;
		int i = 0;
		
		while(t > 0 && i < A.length) {
			if(t - A[i] >= 0) {
				t = t - A[i];
				count = count + 1;
			}
			i = i + 1;
		}
		
		return count;
	}

}
