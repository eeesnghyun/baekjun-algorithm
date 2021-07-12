package com.baek.algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2869 {

	public static void main(String[] args) throws IOException {
		/*
		 * Q. 땅 위에 달팽이가 있다. 이 달팽이는 높이가 V미터인 나무 막대를 올라가려고 한다.
		 * 	  달팽이는 낮에 A미터를 올라가고 밤에 B미터 미끄러진다.
		 *    달팽이가 나무 막대를 모두 올라가려면, 며칠이 걸리는지 구하는 프로그램을 작성하시오.
		 *
		 * 입력
		 * - 세 정수 A, B, V가 공백으로 구분되어서 주어진다.
		 *
		 * 조건
		 * - 1 ≤ B < A ≤ V ≤ 1000000000
		 * - 정상에 올라간 후에는 미끄러지지 않는다.
		 * - 시간제한 0.15초
		 */
		BufferedReader bf  = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine(), " ");

		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int v = Integer.parseInt(st.nextToken());

		int day = (v - b) / (a - b);

		if(((v - b) % (a - b)) != 0) {
			day = day + 1;
		}

		System.out.println(day);

		bf.close();
	}
}