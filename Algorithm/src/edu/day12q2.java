package edu;

import java.util.Arrays;
import java.util.Scanner;

public class day12q2 {
	
	public static void Dice(int n, int[] D, int c) {
		if(c==n) {
			System.out.println(Arrays.toString(D));
		}else if(c<n) {
			for(int i = 1; i <= 6; i++) {
				D[c] = i;
				Dice(n, D, c+1);
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		int[] D;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�� ���α׷��� N(>0)���� �ֻ������� ������ ���� �� �ִ� ��� ���յ��� ����ϴ� �˰����̴�.");
		System.out.println("N�� �Է��Ͻÿ�");
		n = sc.nextInt();
		while(n<=0) {
			System.out.println("���ǿ� �´� ���� �ƴմϴ�. �ٽ� �Է��Ͻÿ�");
			n = sc.nextInt();
		}
		
		D = new int[n];
		
		Dice(n, D, 0);
	}

}
