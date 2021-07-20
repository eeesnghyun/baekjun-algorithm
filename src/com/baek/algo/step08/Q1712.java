package com.baek.algo.step08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1712 {

	public static void main(String[] args) throws IOException {
		/*
		 * Q. 월드전자는 노트북을 제조하고 판매하는 회사이다.
		 *    노트북 판매 대수에 상관없이 매년 A만원의 고정 비용이 들며, 한 대의 노트북을 생산하는 데에는 총 B만원의 가변 비용이 든다고 한다.
		 *    노트북 판매 가격을 C라고 했을 때, 손익분기점(총 수입이 총 비용보다 많아지게 되는 지점)을 구하는 프로그램을 작성하시오.
		 *
		 * 입력
		 * - 첫째 줄에 A, B, C가 빈 칸을 사이에 두고 순서대로 주어진다.
		 * - A : 고정 비용
		 * - B : 가변 비용
		 * - C : 판매 가격
		 *
		 * 조건
		 * - A, B, C는 21억 이하의 자연수이다.
		 * - 첫 번째 줄에 손익분기점 즉 최초로 이익이 발생하는 판매량을 출력한다. 손익분기점이 존재하지 않으면 -1을 출력한다.
		 */
		BufferedReader bf  = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine(), " ");

		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		int point = 1;

		/*
		 * 1. a + (b * i) < c * i
		 * 2. a/i + b < c
		 * 3. a/i < c - b
		 * 4. a < (c - b) * i
		 * 5. (170 - 70) * i = 1000
		 * 6. i = 10
		 */

		// 가변 비용이 판매 가격보다 높거나 같다면 손익분기점이 존재하지 않음
		if(b >= c) {
			point = -1;
		} else {
			point = (a / (c - b)) + 1;
		}

		System.out.println(point);

		bf.close();
	}
}