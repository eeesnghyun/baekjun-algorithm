package com.baek.algo.step09;

import java.util.Scanner;

public class Q1978 {

	public static void main(String[] args) {
		/*
		 * Q. 주어진 수 N개 중에서 소수가 몇 개인지 찾아서 출력하는 프로그램을 작성하시오.
		 *
		 * 입력
		 * - 첫 줄에 수의 개수 N이 주어진다.
		 * - 둘째 줄에 N개의 수가 주어진다.
		 *
		 * 조건
		 * - N은 100이하이다.
		 * - N개의 수는 1000이하의 자연수이다.
		 */
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int cnt = 0;

		for(int i = 0; i < n; i++) {
			int num = sc.nextInt();

			// 소수 : 1보다 큰 자연수 중 1과 자기 자신만을 약수로 갖는 수
			if(num > 1) {
				boolean pNum = true;

				for(int j = 1; j <= num; j++) {
					if(j != 1 && j != num) {
						if(num % j == 0) {
							pNum = false;
							break;
						}
					}
				}

				if(pNum == true) {
					cnt = cnt + 1;
				}
			}
		}

		System.out.println(cnt);

		sc.close();
	}
}