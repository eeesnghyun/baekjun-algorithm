package com.baek.algo.step08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q10757 {

	public static void main(String[] args) throws IOException {
		/*
		 * Q. 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
		 *
		 * 입력
		 * - 첫째 줄에 A와 B가 주어진다.
		 *
		 * 조건
		 * - 0 < A,B < 10의 10000승
		 */
		BufferedReader bf  = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine(), " ");

		// long타입 범위 : -9223372036854775808 ~ 922 3372 0368 5477 5807

		//   9223372036854775807
		// + 9223372036854775808
		// ---------------------
		//  18446744073709551615

		String result = "";
		String a = st.nextToken();
		String b = st.nextToken();
		String[] strA = a.split("");
		String[] strB = b.split("");

		int seqA = 0;
		int seqB = 0;
		int length = strA.length >= strB.length ? strA.length : strB.length;
		int[] intA = new int[length];
		int[] intB = new int[length];

		// 입력받은 숫자를 역순으로 배열에 담는 작업
		for(int i = strA.length-1; i >= 0; i--) {
			intA[seqA] = Integer.parseInt(strA[i]);

			seqA = seqA + 1;
		}

		for(int i = strB.length-1; i >= 0; i--) {
			intB[seqB] = Integer.parseInt(strB[i]);

			seqB = seqB + 1;
		}

		int addNum  = 0;
		int lastNum = 0;

		for(int i = 0; i < length; i++) {
			int sum = intA[i] + intB[i] + addNum;

			// 10이 넘는 경우 나머지 값을 다음 합에 추가
			if(sum >= 10) {
				addNum = sum / 10;
			} else {
				addNum = 0;
			}

			// 마지막 숫자의 합이 10이 넘는 경우 체크
			if(i == (length-1)) {
				if(sum >= 10) {
					lastNum = sum / 10;
				}
			}

			result = (sum % 10) + result;
		}

		if(lastNum == 0) {
			System.out.println(result);
		} else {
			System.out.println(lastNum + result);
		}

		bf.close();
	}
}