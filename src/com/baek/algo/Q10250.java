package com.baek.algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q10250 {

	public static void main(String[] args) throws IOException {
		/*
		 * Q. ACM 호텔 매니저 지우는 손님이 도착하는 대로 빈 방을 배정하고 있다.
		 *    고객 설문조사에 따르면 손님들은 호텔 정문으로부터 걸어서 가장 짧은 거리에 있는 방을 선호한다고 한다.
		 *    호텔 정문은 일층 엘리베이터 바로 앞에 있는데, 정문에서 엘리베이터까지의 거리는 무시한다.
		 *    설문조사 결과 대로 호텔 정문으로부터 걷는 거리가 가장 짧도록 방을 배정하는 프로그램을 작성하시오.
		 *
		 * 입력
		 * - 첫 줄에 테스트 데이터 개수 T가 주어진다.
		 * - 호텔의 층 수, 각 층의 방 수, 몇번째 손님인지를 나타내는 세 정수 H, W, N이 주어진다.
		 *
		 * 조건
		 * - 1 ≤ H, W ≤ 99, 1 ≤ N ≤ H × W
		 * - 호텔은 직사각형 모양이고 각 층에 W 개의 방이 있는 H 층 건물이다.
		 * - 모든 인접한 두 방 사이의 거리는 같은 거리(거리 1)라고 가정한다.
		 * - 모든 방은 비어있다고 가정하고 N 번째로 도착한 손님에게 배정될 방 번호를 계산한다.
		 *   Ex) ...
		 *       301 302 303 304 305
		 *       201 202 203 204 205
		 *       101 102 103 104 105 ...
		 *       6번째 손님 : 302호 배정
		 */
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(bf.readLine());

		for(int i = 0; i < t; i++) {
			String arr[] = bf.readLine().split(" ");

			int h = Integer.parseInt(arr[0]);
			int w = Integer.parseInt(arr[1]);
			int n = Integer.parseInt(arr[2]);

			int room   = 0;
			int floor  = n % h;
			int number = (n / h) + 1;

			if(floor == 0) {
				room = (h * 100) + (n / h);
			} else {
				room = (floor * 100) + number;
			}

			System.out.println(room);
		}

		bf.close();
	}
}