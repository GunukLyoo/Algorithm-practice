package edu;

import java.util.Random;
import java.util.Scanner;

public class day3q2 {
	
	public static int countSnum(int n, int s, int c) {
		int count = c;
		int result = 0;

		if((n/10)==0) {
			if((n%10)==s)
				count = c+1;
			return count;
		}
		else if((n/10)>0) {
			if((n%10)==s)
				count=c+1;
			
			result = countSnum(n/10, s, count);
			
		}
		
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 0;
		int s = 0;
		int count = 0;
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		
		n = rand.nextInt(Integer.MAX_VALUE);
		
		System.out.println("�� ���α׷��� ������ ���� ������ �����Ͽ� �Է��� ����(0~9)�� �� �������� ��� ��Ÿ�������� ���ϴ� ���α׷��Դϴ�.");
		System.out.println("���ڸ� �Է��Ͽ� �ֽʽÿ�");
		s = sc.nextInt();
		while(s<0 || s>9) {
			System.out.println("���ǿ� �´� ���� �ƴմϴ�. �ٽ� �Է��Ͽ� �ֽʽÿ�");
			s = sc.nextInt();			
		}
		
		count = countSnum(n, s, 0);
		System.out.println("������ ���� ���� " + n + " �� ��Ÿ�� " + s + " �� ������ " + count + " �� �Դϴ�.");
	}

}
