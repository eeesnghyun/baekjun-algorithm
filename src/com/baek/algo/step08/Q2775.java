package com.baek.algo.step08;

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
		 * - 1 ≤ K, N ≤ 14
		 * - K층 N호에 살려면 자신의 아래(K-1)층의 1호부터 N호까지 사람들의 수의 합만큼 사람들이 살아야한다.
		 * - 아파트는 0층부터 있고 각층은 1호부터 있으며 0층의 i호에는 i명이 산다.
		 */
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();

		for(int i = 0; i < t; i++) {
			int k = sc.nextInt();
			int n = sc.nextInt();

			if(n >= 14) n = 14;

			int[][] arr = new int[k + 1][n];

			for(int x = 0; x <= k; x++) {
				for(int y = 0; y < n; y++) {
					int sum = 0;

					if(x == 0) {
						arr[x][y] = y + 1;
					} else {
						for(int j = 0; j <= y; j++) {
							sum = sum + arr[x-1][j];
						}
						arr[x][y] = sum;
					}
				}
			}

			System.out.println(arr[k][n-1]);
		}

		sc.close();
	}
}