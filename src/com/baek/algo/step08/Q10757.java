package com.baek.algo.step08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q10757 {

	public static void main(String[] args) throws IOException {
		/*
		 * Q. �� ���� A�� B�� �Է¹��� ����, A+B�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 *
		 * �Է�
		 * - ù° �ٿ� A�� B�� �־�����.
		 *
		 * ����
		 * - 0 < A,B < 10�� 10000��
		 */
		BufferedReader bf  = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine(), " ");

		// longŸ�� ���� : -9223372036854775808 ~ 922 3372 0368 5477 5807

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

		// �Է¹��� ���ڸ� �������� �迭�� ��� �۾�
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

			// 10�� �Ѵ� ��� ������ ���� ���� �տ� �߰�
			if(sum >= 10) {
				addNum = sum / 10;
			} else {
				addNum = 0;
			}

			// ������ ������ ���� 10�� �Ѵ� ��� üũ
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