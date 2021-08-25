package com.baek.algo.step10;

import java.util.Scanner;

public class Q10870 {

	private static int Fibonacci(int n) {
		if(n <= 1) {
			return n;
		} else {
			return Fibonacci(n-2) + Fibonacci(n-1);
		}
	}

	public static void main(String[] args) {
		/*
		 * Q. �Ǻ���ġ ���� 0�� 1�� �����Ѵ�. 0��° �Ǻ���ġ ���� 0�̰�, 1��° �Ǻ���ġ ���� 1�̴�.
		 *    �� ���� 2��° ���ʹ� �ٷ� �� �� �Ǻ���ġ ���� ���� �ȴ�.
		 *    n�� �־����� ��, n��° �Ǻ���ġ ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 *
		 * �Է�
		 * - ù° �ٿ� n�� �־�����.
		 *
		 * ����
		 * - n�� 20���� �۰ų� ���� �ڿ��� �Ǵ� 0�̴�.
		 */
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int result = 0;

		for(int i = 1; i <= n; i++) {
			result = Fibonacci(i);
		}

		System.out.println(result);

		sc.close();
	}
}