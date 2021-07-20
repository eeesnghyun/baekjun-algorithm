package com.baek.algo.step09;

import java.util.Scanner;

public class Q2581 {

	public static void main(String[] args) {
		/*
		 * Q. �ڿ��� M�� N�� �־��� �� M�̻� N������ �ڿ��� �� �Ҽ��� ���� ��� ��� �̵� �Ҽ��� �հ� �ּڰ��� ã�� ���α׷��� �ۼ��Ͻÿ�.
		 *
		 * �Է�
		 * - ù° �ٿ� M��, ��° �ٿ� N�� �־�����.
		 *
		 * ����
		 * - M�� N�� 10000������ �ڿ����̸�, M�� N���� �۰ų� ����.
		 * - M�̻� N������ �ڿ��� �� �Ҽ��� ���� ��� ã�� ù° �ٿ� �� ����, ��° �ٿ� �� �� �ּڰ��� ����Ѵ�.
		 * - M�̻� N������ �ڿ��� �� �Ҽ��� ���� ���� ù° �ٿ� -1�� ����Ѵ�.
		 */
		Scanner sc = new Scanner(System.in);

		int m = sc.nextInt();
		int n = sc.nextInt();
		int min = n;
		int sum = 0;

		for(int i = m; i <= n; i++) {
			boolean pNum = true;

			if(i > 1) {
				for(int j = 2; j < i; j++) {
					if(i % j == 0) {
						pNum = false;
						break;
					}
				}

				if(pNum == true) {
					sum = sum + i;
					min = i < min ? i : min;
				}
			}
		}

		if(sum == 0) {
			System.out.println(-1);
		} else {
			System.out.println(sum);
			System.out.println(min);
		}

		sc.close();
	}
}