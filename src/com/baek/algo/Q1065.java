package com.baek.algo;

import java.util.Scanner;

public class Q1065 {

	public static void main(String[] args) {
		/*
		 * Q. N이 주어졌을 때, 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력하는 프로그램을 작성하시오.
		 *
		 * 입력
		 * - 1000보다 작거나 같은 자연수 N이 주어진다.
		 *
		 * 조건
		 * - 어떤 양의 정수 X의 각 자리가 등차수열을 이룬다면, 그 수를 한수라고 한다.
		 * - 등차수열은 연속된 두 개의 수의 차이가 일정한 수열을 말한다.
		 */
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int x = 1;
		int hansu = 0;

		while(true) {
			if(x < 100) {
				hansu = x;
			} else if(x >= 100 & x <= 1000) {
				int a = x / 100;
				int b = x / 10 % 10;
				int c = x % 10;

				if((a - b) == (b - c)) {
					hansu = hansu + 1;
				}
			}

			if(x == n || n > 1000) {
				break;
			}

			x = x + 1;
		}

		System.out.println(hansu);

		sc.close();
	}
}