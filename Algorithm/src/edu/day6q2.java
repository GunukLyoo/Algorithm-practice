package edu;

import java.awt.Point;
import java.util.Scanner;

public class day6q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m, n;
		Point[] P = new Point[3];
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i<3; i++) {
			P[i] = new Point();
		}
		
		
		P[0].setLocation(4, 0);
		P[1].setLocation(2, 1);
		P[2].setLocation(1, 3);
		
		System.out.println("�� ���α׷��� �Է��� m, n �� ũ�⸦ ���� �����θ� �����Ͽ� �ִ� �Ÿ� ������ ���ϴ� ���α׷��Դϴ�.");
		System.out.println("m, n �� �Է��ϼ���.(1�̻�)");
		m=sc.nextInt();
		n=sc.nextInt();
		while(m<=0 || n<=0) {
			System.out.println("���ǿ� �´� ���� �ƴմϴ� �ٽ� �Է����ּ���.");
			m=sc.nextInt();
			n=sc.nextInt();
		}

		
		int count = getSway(m, n, P);
		
		System.out.println("�ִ� �ŷ� ������ " + count + " �� �Դϴ�.");
	}

	public static int getSway(int m, int n, Point[] p) {
		int[][] A = new int[m+2][n+2];
		A[0][0] = 0;
		
		for(int i = 1; i<=m+1; i++) {
			A[i][0] = 1;
			System.out.println(A[i][0]);
		}
		for(int i = 1; i<=n+1; i++) {
			A[0][i] = 1;
		}
		
		for(int j = 1; j<=n+1; j++) {
			for(int i = 1; i<=m+1; i++) {
				System.out.print(A[i][j]+" ");
			}
			System.out.println();
		}
		
		
		for(int i = 1; i<=m; i++) {
			for(int j = 1; j<=n; j++) {
				for(int l = 0; l<p.length; l++) {
					if(i == p[l].x && j == p[l].y) A[i][j] = 0;
					else A[i][j] = A[i-1][j] + A[i][j];
					
					
				}
				//System.out.print(A[i][j]+" ");
			}
			System.out.println();
		}
		
		return A[m][n];
	}
}
