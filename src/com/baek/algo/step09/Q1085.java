package com.baek.algo.step09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1085 {

	public static void main(String[] args) throws IOException {
		/*
		 * Q. 한수는 지금 (x, y)에 있다. 직사각형의 왼쪽 아래 꼭짓점은 (0, 0)에 있고, 오른쪽 위 꼭짓점은 (w, h)에 있다.
		 *    직사각형의 경계선까지 가는 거리의 최솟값을 구하는 프로그램을 작성하시오.
		 *
		 * 입력
		 * - 첫째 줄에 x, y, w, h가 주어진다.
		 *
		 * 조건
		 * - 1 ≤ w, h ≤ 1000
		 * - 1 ≤ x ≤ w-1
		 * - 1 ≤ y ≤ h-1
		 * - x, y, w, h는 정수
		 */
		BufferedReader bf  = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine(), " ");

		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());



		bf.close();
	}
}