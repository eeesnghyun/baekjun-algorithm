package com.baek.algo.step12;

import java.util.Arrays;
import java.util.Scanner;

public class Q2750 {

	public static void main(String[] args) {
		/*
		 * Q. N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.
		 *
		 * 입력
		 * - 첫째 줄에 수의 개수 N(1 ≤ N ≤ 1,000)이 주어진다.
		 * - 둘째 줄부터 N개의 줄에는 수 주어진다.
		 *
		 * 조건
		 * - 이 수는 절댓값이 1,000보다 작거나 같은 정수이다. 수는 중복되지 않는다.
		 * - 첫째 줄부터 N개의 줄에 오름차순으로 정렬한 결과를 한 줄에 하나씩 출력한다.
		 */
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] arr = new int[n];

		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		for(int i = 0; i < n; i++) {
			for(int j = i + 1; j < n; j++) {
				if(j == n) {
					break;
				}

				if(arr[i] > arr[j]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}

			System.out.println(arr[i]);
		}

		sc.close();
	}
}