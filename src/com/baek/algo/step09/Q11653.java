package com.baek.algo.step09;

import java.util.Scanner;

public class Q11653 {

	public static void main(String[] args) {
		/*
		 * Q. ���� N�� �־����� ��, ���μ������ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 *
		 * �Է�
		 * - ù° �ٿ� ���� N�� �־�����.
		 *
		 * ����
		 * - 1 �� N �� 10000000
		 * - N�� ���μ����� ����� �� �ٿ� �ϳ��� ������������ ����Ѵ�. N�� 1�� ��� �ƹ��͵� ������� �ʴ´�.
		 */
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		if(n == 1) {
			System.out.println("");
		} else {
			int num = n;
			int a = 2;

			while(true) {
				// 1�� �Ǹ� ����
				if(num <= 1) {
					break;
				} else {
					if(num % a == 0) {
						num = num / a;
						// 72 - 2
						// 36 - 2
						// 18 - 2
						// 9  - 3
						// 3  - 3

						System.out.println(a);
					} else {
						a = a + 1;
					}
				}
			}
		}

		sc.close();
	}
}