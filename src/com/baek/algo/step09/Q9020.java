package com.baek.algo.step09;

import java.util.Scanner;

public class Q9020 {

	public static void main(String[] args) {
		/*
		 * Q. 골드바흐의 추측은 유명한 정수론의 미해결 문제로, 2보다 큰 모든 짝수는 두 소수의 합으로 나타낼 수 있다는 것이다.
		 * 	  이러한 수를 골드바흐 수라고 한다. 또, 짝수를 두 소수의 합으로 나타내는 표현을 그 수의 골드바흐 파티션이라고 한다.
		 *    예를 들면, 4 = 2 + 2, 6 = 3 + 3, 8 = 3 + 5, 10 = 5 + 5, 12 = 5 + 7, 14 = 3 + 11, 14 = 7 + 7이다.
		 *    10000보다 작거나 같은 모든 짝수 n에 대한 골드바흐 파티션은 존재한다.
		 *    2보다 큰 짝수 n이 주어졌을 때, n의 골드바흐 파티션을 출력하는 프로그램을 작성하시오.
		 *
		 * 입력
		 * - 첫째 줄에 테스트 케이스의 개수 T가 주어진다.
		 * - 각 테스트 케이스는 한 줄로 이루어져 있고 짝수 n이 주어진다.
		 *
		 * 조건
		 * - 4 ≤ n ≤ 10000
		 * - 만약 가능한 n의 골드바흐 파티션이 여러 가지인 경우에는 두 소수의 차이가 가장 작은 것을 출력한다.
		 * - 출력하는 소수는 작은 것부터 먼저 출력하며, 공백으로 구분한다.
		 *
		 */
		Scanner sc = new Scanner(System.in);

		boolean arr[] = new boolean[10001];

		// 에라토스테네스의 체
		for(int i = 0; i <= 10000; i++) {
			arr[i] = true;
		}

		for(int i = 2; i <= 10000; i++) {
			for(int j = i * 2; j <= 10000; j = j + i) {
				if(arr[j] == true) {
					arr[j] = false;
				}
			}
		}

		int t = sc.nextInt();

		for(int seq = 0; seq < t; seq++) {
			int n = sc.nextInt();

			int max = n / 2;
			int gap = n - 2;
			int pMin = 0;
			int pMax = 0;

			for(int i = 2; i <= max; i++) {
				if(arr[i] == true && arr[n - i] == true) {
					pMin = i;
					pMax = n - i;

					// 두 소수의 차이가 가장 작은 것을 출력
					if(gap >= (pMax - pMin)) {
						gap = pMax - pMin;
					}
				}
			}

			System.out.println(pMin + " " + pMax);
		}

		sc.close();
	}
}