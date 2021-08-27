package com.baek.algo.step11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2798 {

	public static void main(String[] args) throws IOException {
		/*
		 * Q. 블랙잭 게임
		 * 	  각 카드에는 양의 정수가 쓰여 있다. 그 다음, 딜러는 N장의 카드를 모두 숫자가 보이도록 바닥에 놓는다. 그런 후에 딜러는 숫자 M을 크게 외친다.
		 * 	  이제 플레이어는 제한된 시간 안에 N장의 카드 중에서 3장의 카드를 골라야 한다. 블랙잭 변형 게임이기 때문에, 플레이어가 고른 카드의 합은 M을 넘지 않으면서 M과 최대한 가깝게 만들어야 한다.
 		 *    N장의 카드에 써져 있는 숫자가 주어졌을 때, M을 넘지 않으면서 M에 최대한 가까운 카드 3장의 합을 구해 출력하시오.
 		 *
 		 * 입력
 		 * - 첫째 줄에 카드의 개수 N과 M이 주어진다.
 		 * - 둘째 줄에는 카드에 쓰여 있는 수가 주어지며, 이 값은 100,000을 넘지 않는 양의 정수이다.
 		 *
 		 * 조건
 		 * - 3 ≤ N ≤ 100
 		 * - 10 ≤ M ≤ 300,000
 		 * - 첫째 줄에 M을 넘지 않으면서 M에 최대한 가까운 카드 3장의 합을 출력한다.
		 */
		BufferedReader bf   = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st  = new StringTokenizer(bf.readLine(), " ");
		StringTokenizer st2 = new StringTokenizer(bf.readLine(), " ");

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int[] card = new int[n];
		int min = 0;
		int sum = 0;
		int result = 0;

		for(int i = 0; i < n; i ++) {
			card[i] = Integer.parseInt(st2.nextToken());
		}

		/**
		 * n : 5 / m : 21
		 * card - [0]:3
		 * 		  [1]:9
		 * 		  [2]:5
		 *        [3]:8
		 *        [4]:12
		 */
		for(int i = 0; i < n - 2; i++) {
			for(int j = i + 1; j < n - 1; j++) {
				for(int h = j + 1; h < n; h++) {
					// 3 9 5  : 17
					// 3 9 8  : 20
					// 3 9 12 : 24
					// 3 5 8  : 16
					// 3 5 12 : 20
					// 3 8 12 : 23
					// 9 5 8  : 22
					// 9 5 12 : 26
					// 9 8 12 : 29
					// 5 8 12 : 25
					sum = card[i] + card[j] + card[h];

					if(sum <= m && sum >= min) {
						min = sum;
						result = sum;
					}
				}
			}
		}

		System.out.println(result);

		bf.close();
	}
}