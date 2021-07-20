package com.baek.algo.step09;

import java.util.Scanner;

public class Q2581 {

	public static void main(String[] args) {
		/*
		 * Q. 자연수 M과 N이 주어질 때 M이상 N이하의 자연수 중 소수인 것을 모두 골라 이들 소수의 합과 최솟값을 찾는 프로그램을 작성하시오.
		 *
		 * 입력
		 * - 첫째 줄에 M이, 둘째 줄에 N이 주어진다.
		 *
		 * 조건
		 * - M과 N은 10000이하의 자연수이며, M은 N보다 작거나 같다.
		 * - M이상 N이하의 자연수 중 소수인 것을 모두 찾아 첫째 줄에 그 합을, 둘째 줄에 그 중 최솟값을 출력한다.
		 * - M이상 N이하의 자연수 중 소수가 없을 경우는 첫째 줄에 -1을 출력한다.
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