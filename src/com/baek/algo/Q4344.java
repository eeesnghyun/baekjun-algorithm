package com.baek.algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q4344 {

	public static void main(String[] args) throws IOException {
		/*
		 * Q. 학생들의 평균 점수를 구하는 프로그램을 작성하시오.
		 *
		 * 입력
		 * - 첫째 줄에는 테스트 케이스의 개수 C가 주어진다.
		 * - 둘째 줄부터 각 테스트 케이스마다 학생의 수 N이 첫 수로 주어지고, 이어서 N명의 점수가 주어진다.
		 *
		 * 조건
		 * - 학생의 수 N은 1 ≤ N ≤ 1000인 정수이다.
		 * - 점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.
		 * - 각 케이스마다 한 줄씩 평균을 넘는 학생들의 비율을 반올림하여 소수점 셋째 자리까지 출력한다.(문자형X)
		 */
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		int c = Integer.parseInt(bf.readLine());		// 테스트 케이스 수

		for(int i = 0; i < c; i++) {
			String arr[] = bf.readLine().split(" ");

			int n   = Integer.parseInt(arr[0]);			// 학생수
			int sum = 0;
			int cnt = 0;

			for(int j = 1; j <= n; j++) {
				int score = Integer.parseInt(arr[j]);	// 점수

				sum = sum + score;
			}

			double avg = sum / n;	// 평균

			for(int j = 1; j <= n; j++) {
				int score = Integer.parseInt(arr[j]);

				if(avg < score) {
					cnt = cnt + 1;
				}
			}

			double rate = (double) cnt / (double) n * 100;	// 비율

			System.out.printf("%.3f%%\n", rate);
		}

		bf.close();
	}
}