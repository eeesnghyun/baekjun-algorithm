package com.baek.algo;

import java.util.Scanner;

public class Q2839 {

	public static void main(String[] args) {
		/*
		 * Q. 설탕을 정확하게 N킬로그램 배달해야 할 때, 봉지 몇 개를 가져가면 되는지 그 수를 구하는 프로그램을 작성하시오.
		 *
		 * 입력
		 * - 첫째 줄에 N이 주어진다.
		 *
		 * 조건
		 * - 3 ≤ N ≤ 5000
		 * - 봉지는 3킬로그램 봉지와 5킬로그램 봉지가 있다.
		 * - 봉지의 최소 개수를 출력한다. 만약 정확하게 N킬로그램을 만들 수 없다면 -1을 출력한다.
		 *   Ex) 18킬로그램 설탕을 배달해야 할 때, 3킬로그램 봉지 6개를 가져가도 되지만 5킬로그램 3개와 3킬로그램 1개를 배달하면 더 적은 개수의 봉지를 배달할 수 있다.
		 */
		Scanner sc = new Scanner(System.in);

		int n  = sc.nextInt();
		int k3 = 0;
		int k5 = n / 5;
		int result = 0;

		while(true) {
			if(n % 5 == 0) {
				result = k3 + k5;
				break;
			}

			n  = n - 3;
			k3 = k3 + 1;

			if(n < 0) {
				result = -1;
				break;
			}
		}

		System.out.println(result);

		sc.close();
	}
}