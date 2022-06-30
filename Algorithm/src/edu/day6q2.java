package edu;

import java.awt.Point;
import java.util.Random;
import java.util.Scanner;

public class day6q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m, n;
		int l;
		Random rd= new Random();
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("�� ���α׷��� �Է��� m, n �� ũ�⸦ ���� �����θ� �����Ͽ� l���� ��ֹ��� ������� �ʴ� �ִ� �Ÿ� ������ ���ϴ� ���α׷��Դϴ�.");
		System.out.println("m, n, l �� �Է��ϼ���.(1�̻�)");
		m=sc.nextInt();
		n=sc.nextInt();
		l=sc.nextInt();
		while(m<=0 || n<=0) {
			System.out.println("���ǿ� �´� ���� �ƴմϴ� �ٽ� �Է����ּ���.");
			m=sc.nextInt();
			n=sc.nextInt();
			l=sc.nextInt();
		}

		Point[] P = new Point[l];
		
		for(int i = 0; i<l; i++) {
			P[i] = new Point();
			P[i].x = rd.nextInt(m);
			P[i].y = rd.nextInt(n);
			System.out.print("( " + P[i].x + ", " + P[i].y + ") ");
		}

		System.out.println();
		System.out.println();
		
		int count = getSway(m, n, P);
		
		System.out.println("�ִ� �ŷ� ������ " + count + " �� �Դϴ�.");
	}

	public static int getSway(int m, int n, Point[] p) {
		int[][] A = new int[m+1][n+1];
		
		for(int j = 0; j<n+1; j++) {
			for(int i = 0; i<m+1; i++) {
				for(int l = 0; l<p.length; l++) {
					if(i == p[l].x && j == p[l].y) {
						A[i][j] = 0;
						break;
					}
					else if(i == 0 && j == 0) A[i][j] = 0;
					else if(i == 0) A[i][j] = 1;
					else if(j == 0) A[i][j] = 1;
					else A[i][j] = A[i-1][j] + A[i][j-1];
				}
				
			}
		}
		
		for(int j = 0; j<n+1; j++) {
			for(int i = 0; i<m+1; i++) {
				System.out.print(A[i][j]+"	 ");
			}
			System.out.println();
		}
		
		
		return A[m][n];
	}
}
