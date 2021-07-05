package com.baek.algo;

import java.util.Scanner;

public class Q2588 {

	public static void main(String[] args) {
		/*
		 * Q. (세 자리 수) × (세 자리 수)는 다음과 같은 과정을 통하여 이루어진다.
		 *
		 * (1)과 (2)위치에 들어갈 세 자리 자연수가 주어질 때 (3), (4), (5), (6)위치에 들어갈 값을 구하는 프로그램을 작성하시오.
		 *    472 - (1)
		 * x  385 - (2)
		 * ------
		 *   2360 - (3)
		 *  3776  - (4)
		 * 1416   - (5)
		 * ------
		 * 181720
		 */
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int d   = a * (b % 10);
		int e   = a * ((b / 10) % 10);
		int f   = a * (b / 100);
		int tot = a * b;

		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(tot);

		sc.close();
	}
}
