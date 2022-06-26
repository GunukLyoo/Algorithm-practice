package edu;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class day5q2 {
	
	public static int[] sort(int[] A, int n) {
		int i = 0;
		int j = n-1;
		int x;
		
		while(i<j) {
			if(A[i] < 0) i = i + 1;
			else if(A[j] >= 0) j = j - 1;
			else {
				x = A[i];
				A[i] = A[j];
				A[j] = x;
				i = i + 1;
				j = j - 1;
			}
		}
		
		return A;
	}
	
	public static void main(String[] args) {
		int n=0;
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		
		System.out.println("이 프로그램은 입력한 숫자 N의 크기를 가진 0과 양의 정수와 음의 정수가 랜덤으로 들어간");
		System.out.println("배열 A[n]을 음의 정수는 앞쪽 0을 포함한 양의 정수는 뒷쪽으로 정렬하는 프로그램입니다.");
		System.out.println("양의 정수 n을 입력하세요");
		n = sc.nextInt();
		while(n<=0) {
			System.out.println("조건에 해당하는 정수가 아닙니다. 다시 입력해 주세요");
			n = sc.nextInt();
		}
		
		int[] A = new int[n];
		
		for(int i = 0; i < n; i++) {
			A[i] = rd.nextInt();
		}
		
		System.out.println("생성된 함수 A[n]은");
		System.out.println(Arrays.toString(A));
		System.out.println("입니다.");
		
		A = sort(A, n);
		
		System.out.println("정렬된 함수 A[n]은");
		System.out.println(Arrays.toString(A));
		System.out.println("입니다.");
	}
}
