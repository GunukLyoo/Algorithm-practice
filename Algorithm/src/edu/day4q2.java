package edu;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class day4q2 {
	
	public static int findMin(int[] A, int low, int high) {
		int mid = 0;
		int min = 0;
		int min1, min2;
		if(low==high) {
			min=A[low];
			return min;
		}
		else if(low==high-1){
			if(A[low]<A[high]) min = A[low];
			else min = A[high];
			return min;
		}
		else {
			mid = (low+high)/2;
			min1 = findMin(A, low, mid);
			min2 = findMin(A, mid+1, high);
			if(min1<=min2) min = min1;
			else min = min2;
			
			System.out.println("배열 A의 최솟값은 " + min + "이다.");
			
			return min;
		}
		
		

	}

	public static void main(String[] args) {
		int min=0;
		int n;
		int i=0;
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		
		System.out.println("N(>=1)의 정수들의 배열에서 최소값을 찾는 분할 정복 프로그램이다.");
		System.out.println("숫자를 입력하여 주십시오");
		n = sc.nextInt();
		while(n<1) {
			System.out.println("조건에 맞는 수가 아닙니다. 다시 입력하여 주십시오");
			n = sc.nextInt();			
		}
		
		int[] A = new int[n];
		
		while(i<n) {
			A[i] = rd.nextInt(100);
			i++;
		}
		
	    System.out.println(n + "의 크기를 가진 배열 A 를 생성했습니다.");
	    System.out.println("A = " + Arrays.toString(A));
	    
	    findMin(A, 0, n);
	}
}
