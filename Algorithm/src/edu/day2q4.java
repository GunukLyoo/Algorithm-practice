package edu;

import java.util.*;
import java.util.stream.Collectors;

public class day2q4 {
	
	public static List mkmissing(int n) {
		Random rand = new Random();
		int l=n-1;
		int x = rand.nextInt(n);
		int A[] = new int[l];
		int c=0;
		
		for(int i=1;i<=n;i++) {
			if(i==x) {
				
			}
			else {
				A[c]=i;
				c++;
			}
		}
		
		List<Integer> b = Arrays.stream(A).boxed().collect(Collectors.toList());;
		Collections.shuffle(b);
		
		//System.out.println(b.toString());
		
		return b;
	}
	
	public static int searchmissing(List<Integer> l, int n) {
		int sum = n*(n+1)/2;
		
		for(Integer i : l) {
			sum = sum - i;
		}
		
		//System.out.println(sum);
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=0;
		List<Integer> l;
		int miss;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�� ���α׷��� ���� n�� �Է½� 1~n ������ ������ �������� 1������ �� �迭�� �����Ͽ� ���� ���ڸ� ã�� ���α׷��Դϴ�.");
		System.out.println("n�� �Է��Ͻÿ�(2�̻��� �������� �մϴ�)");
		n=sc.nextInt();
		while(n<=1) {
			System.out.println("���ǿ� �´� ���� �ƴմϴ�. �ٽ� �Է��� �ּ���.(2�̻��� �������� �մϴ�)");
			n=sc.nextInt();
		}
		
		l=mkmissing(n);
		System.out.println("������ �迭�� " + l.toString() + "�Դϴ�.");
		
		miss = searchmissing(l, n);
		
		System.out.print("�����ִ� ���ڴ� " + miss + "�Դϴ�.");
	}

}
