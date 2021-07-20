package com.baek.algo.step09;

import java.util.Scanner;

public class Q11653 {

	public static void main(String[] args) {
		/*
		 * Q. 정수 N이 주어졌을 때, 소인수분해하는 프로그램을 작성하시오.
		 *
		 * 입력
		 * - 첫째 줄에 정수 N이 주어진다.
		 *
		 * 조건
		 * - 1 ≤ N ≤ 10000000
		 * - N의 소인수분해 결과를 한 줄에 하나씩 오름차순으로 출력한다. N이 1인 경우 아무것도 출력하지 않는다.
		 */
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		if(n == 1) {
			System.out.println("");
		} else {
			int num = n;
			int a = 2;

			while(true) {
				// 1이 되면 종료
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