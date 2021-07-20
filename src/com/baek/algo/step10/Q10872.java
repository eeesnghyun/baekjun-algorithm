package com.baek.algo.step10;

import java.util.Scanner;

public class Q10872 {

	private static int Factorial(int n) {
		if(n <= 1) {
			return 1;
		} else {
			return n * Factorial(n - 1);
		}
	}

	public static void main(String[] args) {
		/*
		 * Q. 0���� ũ�ų� ���� ���� N�� �־�����. �̶�, N!�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 *
		 * �Է�
		 * - ù° �ٿ� ���� N�� �־�����.
		 *
		 * ����
		 * - 0 �� N �� 12
		 * - ù° �ٿ� N!�� ����Ѵ�.
		 */
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int sum = Factorial(n);

		System.out.println(sum);

		sc.close();
	}
}