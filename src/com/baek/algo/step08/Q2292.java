package com.baek.algo.step08;

import java.util.Scanner;

public class Q2292 {

	public static void main(String[] args) {
		/*
		 * Q. �׸��� ���� ���������� �̷���� �������� ���� N�� �־�������, �߾� ��ȣ 1���� N������ ���� Ƚ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 *    (�׸� ���� : )
		 *
		 * �Է�
		 * - ���� N�� �־�����.
		 *
		 * ����
		 * - N(1 �� N �� 1000000000)
		 * - Ƚ���� ���۰� ���� �����Ѵ�.
		 */
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int cnt = 2;

		/*
		 * 1 -> 5  : 2 | 1 -> 7  : 2
		 * 1 -> 9  : 3 | 1 -> 13 : 3 | 1 -> 10 : 3
		 * 1 -> 28 : 4 | 1 -> 20 : 4 | 1 -> 31 : 4
		 * 1 -> 40 : 5 | 1 -> 50 : 5
		 * 1 -> 69 : 6
		 */
		if(n == 1) {
			cnt = 1;
		} else {
			int i = 0;
			int min = 2;
			int max = 1;

			while(true) {
				min = min + (6 * i);
				max = max + (6 * (i + 1));

				if(n >= min && n <= max) {
					cnt = cnt + i;
					break;
				}

				i = i + 1;
			}
		}

		System.out.println(cnt);

		sc.close();
	}
}