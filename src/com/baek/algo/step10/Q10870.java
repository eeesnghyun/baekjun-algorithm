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
		 * Q. 피보나치 수는 0과 1로 시작한다. 0번째 피보나치 수는 0이고, 1번째 피보나치 수는 1이다.
		 *    그 다음 2번째 부터는 바로 앞 두 피보나치 수의 합이 된다.
		 *    n이 주어졌을 때, n번째 피보나치 수를 구하는 프로그램을 작성하시오.
		 *
		 * 입력
		 * - 첫째 줄에 n이 주어진다.
		 *
		 * 조건
		 * - n은 20보다 작거나 같은 자연수 또는 0이다.
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