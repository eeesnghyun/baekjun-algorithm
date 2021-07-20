package com.baek.algo.step09;

import java.util.Scanner;

public class Q4948 {

	public static void main(String[] args) {
		/*
		 * Q. 베르트랑 공준은 임의의 자연수 n에 대하여, n보다 크고, 2n보다 작거나 같은 소수는 적어도 하나 존재한다는 내용을 담고 있다.
		 *    이 명제는 조제프 베르트랑이 1845년에 추측했고, 파프누티 체비쇼프가 1850년에 증명했다.
		 *    자연수 n이 주어졌을 때, n보다 크고, 2n보다 작거나 같은 소수의 개수를 구하는 프로그램을 작성하시오.
		 *
		 * 입력
		 * - 입력은 여러 개의 테스트 케이스로 이루어져 있다. 각 케이스는 n을 포함하는 한 줄로 이루어져 있다.
		 * - 입력의 마지막에는 0이 주어진다.
		 *
		 * 조건
		 * - 각 테스트 케이스에 대해서 n보다 크고 2n보다 작거나 같은 소수의 개수를 출력한다.
		 * - 1 ≤ n ≤ 123456
		 */
		Scanner sc = new Scanner(System.in);

		boolean arr[] = new boolean[246913];

		while(true) {
			int n = sc.nextInt();
			int cnt = 0;

			if(n == 0) {
				break;
			} else {
				int max = n * 2;

				// 에라토스테네스의 체
				for(int i = 2; i <= max; i++) {
					arr[i] = true;
				}

				for(int i = 2; i <= max; i++) {
					for(int j = i * 2; j <= max; j = j + i) {
						if(arr[j] == true) {
							arr[j] = false;
						}
					}
				}

				// n보다 크고 2n보다 작은 소수의 개수
				for(int k = n + 1; k <= max; k++) {
					if(arr[k] == true) {
						cnt = cnt + 1;
					}
				}

				System.out.println(cnt);
			}
		}

		sc.close();
	}
}