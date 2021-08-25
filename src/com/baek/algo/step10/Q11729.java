package com.baek.algo.step10;

import java.util.Scanner;

public class Q11729 {

	private static int cnt = 0;
	private static StringBuffer sb = new StringBuffer();

	private static void hanoi(int n, int left, int center, int right) {
		cnt = cnt + 1;

		if(n == 1) {
			sb.append(left + " " + right + "\n");
		} else {
			hanoi(n-1, left, right, center);

			sb.append(left + " " + right + "\n");

			hanoi(n-1, center, left, right);
		}
	}

	public static void main(String[] args) {
		/*
		 * Q. 하노이탑 이동 순서 문제
		 *    세 개의 장대가 있고 첫 번째 장대에는 반경이 서로 다른 n개의 원판이 쌓여 있다.
		 *    각 원판은 반경이 큰 순서대로 쌓여있다. 이제 수도승들이 다음 규칙에 따라 첫 번째 장대에서
		 *    세 번째 장대로 옮기려 한다.
		 *
		 * 입력
		 * - 첫째 줄에 첫 번째 장대에 쌓인 원판의 개수 N이 주어진다.
		 *
		 * 조건
		 * - 1 ≤ N ≤ 20
		 * - 첫째 줄에 옮긴 횟수 K를 출력한다.
		 * - 한 번에 한 개의 원판만을 다른 탑으로 옮길 수 있다. 쌓아 놓은 원판은 항상 위의 것이 아래의 것보다 작아야 한다.
		 * - 두 번째 줄부터 수행 과정을 출력한다. 두 번째 줄부터 K개의 줄에 걸쳐 두 정수 A B를 빈칸을 사이에
		 *   두고 출력하는데, 이는 A번째 탑의 가장 위에 있는 원판을 B번째 탑의 가장 위로 옮긴다는 뜻이다.
		 */
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		hanoi(n, 1, 2, 3);

		System.out.println(cnt);
		System.out.println(sb.toString());

		sc.close();
	}
}