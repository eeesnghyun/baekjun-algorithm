package com.baek.algo;

import java.util.Scanner;

public class Q2588 {

	public static void main(String[] args) {
		/*
		 * Q. (�� �ڸ� ��) �� (�� �ڸ� ��)�� ������ ���� ������ ���Ͽ� �̷������.
		 *
		 * (1)�� (2)��ġ�� �� �� �ڸ� �ڿ����� �־��� �� (3), (4), (5), (6)��ġ�� �� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 *    472 - (1)
		 * x  385 - (2)
		 * ------
		 *   2360 - (3)
		 *  3776  - (4)
		 * 1416   - (5)
		 * ------
		 * 181720
		 */
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int d   = a * (b % 10);
		int e   = a * ((b / 10) % 10);
		int f   = a * (b / 100);
		int tot = a * b;

		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(tot);

		sc.close();
	}
}
