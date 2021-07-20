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
		 * Q. 0보다 크거나 같은 정수 N이 주어진다. 이때, N!을 출력하는 프로그램을 작성하시오.
		 *
		 * 입력
		 * - 첫째 줄에 정수 N가 주어진다.
		 *
		 * 조건
		 * - 0 ≤ N ≤ 12
		 * - 첫째 줄에 N!을 출력한다.
		 */
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int sum = Factorial(n);

		System.out.println(sum);

		sc.close();
	}
}