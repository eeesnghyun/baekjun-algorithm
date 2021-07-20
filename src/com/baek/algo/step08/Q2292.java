package com.baek.algo.step08;

import java.util.Scanner;

public class Q2292 {

	public static void main(String[] args) {
		/*
		 * Q. 그림과 같이 육각형으로 이루어진 모형에서 숫자 N이 주어졌을때, 중앙 번호 1에서 N번까지 가는 횟수를 계산하는 프로그램을 작성하시오.
		 *    (그림 참고 : )
		 *
		 * 입력
		 * - 정수 N이 주어진다.
		 *
		 * 조건
		 * - N(1 ≤ N ≤ 1000000000)
		 * - 횟수는 시작과 끝을 포함한다.
		 */
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int cnt = 2;

		/*
		 * 1 -> 5  : 2 | 1 -> 7  : 2
		 * 1 -> 9  : 3 | 1 -> 13 : 3 | 1 -> 10 : 3
		 * 1 -> 28 : 4 | 1 -> 20 : 4 | 1 -> 31 : 4
		 * 1 -> 40 : 5 | 1 -> 50 : 5
		 * 1 -> 69 : 6
		 */
		if(n == 1) {
			cnt = 1;
		} else {
			int i = 0;
			int min = 2;
			int max = 1;

			while(true) {
				min = min + (6 * i);
				max = max + (6 * (i + 1));

				if(n >= min && n <= max) {
					cnt = cnt + i;
					break;
				}

				i = i + 1;
			}
		}

		System.out.println(cnt);

		sc.close();
	}
}