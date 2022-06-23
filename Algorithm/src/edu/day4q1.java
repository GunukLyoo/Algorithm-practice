package edu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class day4q1 {

	public static void main(String[] args) {
		int min=0;
		int n;
		int i=0;
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		
		System.out.println("N(>=1)의 정수들의 배열에서 최소값을 찾는 억지 기법 프로그램이다.");
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
	    
	    min = A[0];
	    for(i=1; i<n; i++) {
	    	if(min > A[i]) min = A[i];
	    }
	    
	    System.out.println("배열 A의 최소값은 " + min + "입니다.");
	}
}
