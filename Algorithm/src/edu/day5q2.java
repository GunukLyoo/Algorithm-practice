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
		
		System.out.println("�� ���α׷��� �Է��� ���� N�� ũ�⸦ ���� 0�� ���� ������ ���� ������ �������� ��");
		System.out.println("�迭 A[n]�� ���� ������ ���� 0�� ������ ���� ������ �������� �����ϴ� ���α׷��Դϴ�.");
		System.out.println("���� ���� n�� �Է��ϼ���");
		n = sc.nextInt();
		while(n<=0) {
			System.out.println("���ǿ� �ش��ϴ� ������ �ƴմϴ�. �ٽ� �Է��� �ּ���");
			n = sc.nextInt();
		}
		
		int[] A = new int[n];
		
		for(int i = 0; i < n; i++) {
			A[i] = rd.nextInt();
		}
		
		System.out.println("������ �Լ� A[n]��");
		System.out.println(Arrays.toString(A));
		System.out.println("�Դϴ�.");
		
		A = sort(A, n);
		
		System.out.println("���ĵ� �Լ� A[n]��");
		System.out.println(Arrays.toString(A));
		System.out.println("�Դϴ�.");
	}
}
