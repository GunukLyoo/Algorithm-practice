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
		
		
		
		System.out.println("이 프로그램은 입력한 m, n 의 크기를 가진 교차로를 생성하여 l개의 장애물을 통과하지 않는 최단 거리 갯수를 구하는 프로그램입니다.");
		System.out.println("m, n, l 을 입력하세요.(1이상)");
		m=sc.nextInt();
		n=sc.nextInt();
		l=sc.nextInt();
		while(m<=0 || n<=0) {
			System.out.println("조건에 맞는 수가 아닙니다 다시 입력해주세요.");
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
		
		System.out.println("최단 거래 개수는 " + count + " 개 입니다.");
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
