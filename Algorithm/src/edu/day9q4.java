package edu;

import java.util.Arrays;
import java.util.Scanner;

public class day9q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t;
		int max = 0;
		int[] A = {5, 3, 4, 2, 1};
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�� ���α׷��� ���� �ð� T ���� ���� �� �ִ� �ִ� �۾� ���� ���ϴ� Ž�� �˰����� ����ϴ� ���α׷��̴�.");
		System.out.println("T�� �Է��Ͻÿ�(T>0)");
		t = sc.nextInt();
		while(t<=0) {
			System.out.println("���ǿ� �´� T�� �ƴմϴ�. �ٽ� �Է����ּ���.");
			t = sc.nextInt();
		}
		
		Arrays.sort(A);
		max = getMax(t, A);
		
		System.out.println("���ѽð� " + t + " ���� �� �� �ִ� �ִ� �۾� ���� " + max + " �̴�.");
	}
	
	static int getMax(int t, int[ ] A) {
		int count = 0;
		int i = 0;
		
		while(t > 0 && i < A.length) {
			if(t - A[i] >= 0) {
				t = t - A[i];
				count = count + 1;
			}
			i = i + 1;
		}
		
		return count;
	}

}
