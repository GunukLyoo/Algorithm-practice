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
			
			System.out.println("�迭 A�� �ּڰ��� " + min + "�̴�.");
			
			return min;
		}
		
		

	}

	public static void main(String[] args) {
		int min=0;
		int n;
		int i=0;
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		
		System.out.println("N(>=1)�� �������� �迭���� �ּҰ��� ã�� ���� ���� ���α׷��̴�.");
		System.out.println("���ڸ� �Է��Ͽ� �ֽʽÿ�");
		n = sc.nextInt();
		while(n<1) {
			System.out.println("���ǿ� �´� ���� �ƴմϴ�. �ٽ� �Է��Ͽ� �ֽʽÿ�");
			n = sc.nextInt();			
		}
		
		int[] A = new int[n];
		
		while(i<n) {
			A[i] = rd.nextInt(100);
			i++;
		}
		
	    System.out.println(n + "�� ũ�⸦ ���� �迭 A �� �����߽��ϴ�.");
	    System.out.println("A = " + Arrays.toString(A));
	    
	    findMin(A, 0, n);
	}
}
