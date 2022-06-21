package edu;

import java.util.Scanner;

public class Fibonacci {
	
	public static int Fibo(int n) {
		int f1=0;
		int f2=1;
		int x=f1;
		int y=f2;
		int fn=0;
		int count = 1;
		
		System.out.println(count + "�� ����Ǿ����ϴ�.");
		if(n==1) return f1;
		else if(n==2) return f2;
		else if(n>=3) {
			for(int i=3; i<=n; i++) {
				fn=x+y;
				x=y;
				y=fn;
			}
			return fn;
		}
		
		return 0;
	}
	
	public static int FiboRe(int n, int c, int fn, int x, int y, int count) {
		int result=0;
		count++;
		System.out.println("����Լ��� " + count + "��° ȣ�����Դϴ�.");
		
		if(n==1) return 0;
		else if(n==2) return 1;
		else if(n>=3) {
			
			
			if(n==c) {
				return fn;
			}
			else {
				fn=x+y;
				x=y;
				y=fn;
				
				result = FiboRe(n, c+1, fn, x, y, count);
			}
		}
		
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=0;
		int fn=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�� ���α׷��� 1�̻��� ���� n�� �Է��ϸ� n��° �Ǻ���ġ ���� ����ϴ� ���α׷��Դϴ�. n�� �Է��Ͽ� �ֽʽÿ�");
		n=sc.nextInt();
		while(n<1) {
			System.out.println("���ǿ� �´� ���� �ƴմϴ�. 1�̻��� ���� �ٽ� �Է��� �ּ���");
			n=sc.nextInt();
		}
		
		System.out.println("�ݺ����� �̿��� �޼ҵ�� " + n + "��° �Ǻ���ġ ���� ���ϱ� �����մϴ�.");
		fn=Fibo(n);
		System.out.println(n+"��° �Ǻ���ġ ���� " + fn + "�Դϴ�.");
		
		System.out.println();
		
		System.out.println("��� �޼ҵ�� " + n + "��° �Ǻ���ġ ���� ���ϱ� �����մϴ�.");
		fn = FiboRe(n, 2, 0, 0, 1, 0);
		System.out.println(n+"��° �Ǻ���ġ ���� " + fn + "�Դϴ�.");
	}

}
