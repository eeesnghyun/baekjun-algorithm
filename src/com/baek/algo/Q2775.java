package com.baek.algo;

import java.util.Scanner;

public class Q2775 {

	public static void main(String[] args) {
		/*
		 * Q. 아래 조건과 같은 아파트가 있을 때, k층 n호에는 몇 명이 살고 있는지 출력하는 프로그램을 작성하시오.
		 *
		 * 입력
		 * - 첫 번째 줄에 테스트 케이스 T가 주어진다.
		 * - 각각의 케이스마다 첫 번째 줄에 정수 K, 두 번째 줄에 정수 N이 주어진다.
		 *
		 * 조건
		 * - 1 ≤ k, n ≤ 14
		 * - k층 n호에 살려면 자신의 아래(k-1)층의 1호부터 n호까지 사람들의 수의 합만큼 사람들이 살아야한다.
		 * - 아파트는 0층부터 있고 각층은 1호부터 있으며 0층의 i호에는 i명이 산다.
		 */
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();
		int k = sc.nextInt();
		int n = sc.nextInt();

		int cnt = 0;
		int x = n;
		int y = k + (n-1);

		if((k - 1) != 0) {
			for(int i = 0; i < k - 1; i++) {
				System.out.println("i : " + i);
				System.out.println(x);
				x = x + (n + i);
			}
		}

		cnt = x + y;

		System.out.println("k : " + k);
		System.out.println("n : " + n);
		System.out.println("x : " + x);
		System.out.println("y : " + y);

		System.out.println(cnt);

		sc.close();
	}
}