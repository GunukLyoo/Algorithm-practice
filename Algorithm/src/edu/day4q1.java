package edu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class day4q1 {

	public static void main(String[] args) {
		int min=0;
		int n;
		int i=0;
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		
		System.out.println("N(>=1)�� �������� �迭���� �ּҰ��� ã�� ���� ��� ���α׷��̴�.");
		System.out.println("���ڸ� �Է��Ͽ� �ֽʽÿ�");
		n = sc.nextInt();
		while(n<1) {
			System.out.println("���ǿ� �´� ���� �ƴմϴ�. �ٽ� �Է��Ͽ� �ֽʽÿ�");
			n = sc.nextInt();			
		}
		
		int[] A = new int[n];
		
		while(i<n) {
			A[i] = rd.nextInt(100);
			i++;
		}
		
	    System.out.println(n + "�� ũ�⸦ ���� �迭 A �� �����߽��ϴ�.");
	    System.out.println("A = " + Arrays.toString(A));
	    
	    min = A[0];
	    for(i=1; i<n; i++) {
	    	if(min > A[i]) min = A[i];
	    }
	    
	    System.out.println("�迭 A�� �ּҰ��� " + min + "�Դϴ�.");
	}
}
