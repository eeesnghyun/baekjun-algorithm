package com.baek.algo;

import java.util.Scanner;

public class Q1193 {

	public static void main(String[] args) {
		/*
		 * Q. 무한히 큰 배열에 다음과 같이 분수들이 적혀있다. X가 주어졌을 때, X번째 분수를 구하는 프로그램을 작성하시오.
		 * 	  Ex) 14 -> 2/4
		 *
		 * 	  1/1 1/2 1/3 1/4 1/5 ...
		 *    2/1 2/2 2/3 2/4 2/5 ...
		 *    3/1 3/2 3/3 3/4 3/5 ...
		 *    4/1 4/2 4/3 4/4 4/5 ...
		 *    5/1 5/2 5/3 5/4 5/4 ...
		 *
		 *	   1  2  6  7 15 ...
		 *     3  5  8 14 17 ...
		 *     4  9 13 18 26 ...
		 *    10 12 19 25    ...
		 *    11 20 24       ...
		 *
		 * 입력
		 * - 정수 X가 주어진다.
		 *
		 * 조건
		 * - X(1 ≤ X ≤ 10,000,000)
		 */
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();

		/*
		 * 1     -> 1/1
		 * 2~3   -> 1/2, 2/1
		 * 4~6   -> 3/1, 2/2, 1/3
		 * 7~10  -> 1/4, 2/3, 3/2, 4/1
		 * 11~15 -> 5/1, 4/2, 3/3, 2/4, 1,5
		 */
		int i = 1;
		String result = "";

		if(x == 1) {
			result = "1/1";
		} else {
			int min = 1;
			int max = 1;

			while(true) {
				min = min + i;
				max = max + (i + 1);

				if(x >= min && x <= max) {
					int pos = 0;

					for(int k = min; k <= max; k++) {
						if(x == k) {
							break;
						}
						pos = pos + 1;
					}

					int cnt = max - min;
					int a = 0;
					int b = 0;

					for(int j = 0; j <= cnt; j++) {
						if(j == pos) {
							if(cnt % 2 == 0) {
								a = (cnt + 1) + (j * -1);
								b = j + 1;
							} else {
								a = j + 1;
								b = (cnt + 1) + (j * -1);
							}
						}
					}
					result = a + "/" + b;
					break;
				}

				i = i + 1;
			}
		}

		System.out.println(result);

		sc.close();
	}
}