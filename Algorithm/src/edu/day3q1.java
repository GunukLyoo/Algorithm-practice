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
		
		System.out.println("�� ���α׷��� 0 �̻��� ���� n�� �Է¹޾� �ѹ��� �� ��� Ȥ�� �� ��� ��");
		System.out.println("�� n���� ����� ������ ����� ���� ���ϴ� ���α׷��Դϴ�.");
		System.out.println("n�� �Է��Ͽ� �ֽʽÿ�");
		n = sc.nextInt();
		while(n<0) {
			System.out.println("���ǿ� �´� n�� �ƴմϴ�. �ٽ� �Է��� �ֽʽÿ�");
			n = sc.nextInt();
		}
		
		count = upstair(n);
		
		System.out.println("n���� ����� ������ ����� ���� " + count + "���� �Դϴ�.");
	}

}
