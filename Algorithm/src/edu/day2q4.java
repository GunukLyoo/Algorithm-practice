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
		
		System.out.println("이 프로그램은 숫자 n을 입력시 1~n 사이의 숫자중 랜덤으로 1개만을 뺀 배열을 생성하여 빠진 숫자를 찾는 프로그램입니다.");
		System.out.println("n을 입력하시오(2이상의 정수여야 합니다)");
		n=sc.nextInt();
		while(n<=1) {
			System.out.println("조건에 맞는 수가 아닙니다. 다시 입력해 주세요.(2이상의 정수여야 합니다)");
			n=sc.nextInt();
		}
		
		l=mkmissing(n);
		System.out.println("생성된 배열은 " + l.toString() + "입니다.");
		
		miss = searchmissing(l, n);
		
		System.out.print("빠져있는 숫자는 " + miss + "입니다.");
	}

}
