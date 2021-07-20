package com.baek.algo.step09;

import java.util.Scanner;

public class Q9020 {

	public static void main(String[] args) {
		/*
		 * Q. �������� ������ ������ �������� ���ذ� ������, 2���� ū ��� ¦���� �� �Ҽ��� ������ ��Ÿ�� �� �ִٴ� ���̴�.
		 * 	  �̷��� ���� ������ ����� �Ѵ�. ��, ¦���� �� �Ҽ��� ������ ��Ÿ���� ǥ���� �� ���� ������ ��Ƽ���̶�� �Ѵ�.
		 *    ���� ���, 4 = 2 + 2, 6 = 3 + 3, 8 = 3 + 5, 10 = 5 + 5, 12 = 5 + 7, 14 = 3 + 11, 14 = 7 + 7�̴�.
		 *    10000���� �۰ų� ���� ��� ¦�� n�� ���� ������ ��Ƽ���� �����Ѵ�.
		 *    2���� ū ¦�� n�� �־����� ��, n�� ������ ��Ƽ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 *
		 * �Է�
		 * - ù° �ٿ� �׽�Ʈ ���̽��� ���� T�� �־�����.
		 * - �� �׽�Ʈ ���̽��� �� �ٷ� �̷���� �ְ� ¦�� n�� �־�����.
		 *
		 * ����
		 * - 4 �� n �� 10000
		 * - ���� ������ n�� ������ ��Ƽ���� ���� ������ ��쿡�� �� �Ҽ��� ���̰� ���� ���� ���� ����Ѵ�.
		 * - ����ϴ� �Ҽ��� ���� �ͺ��� ���� ����ϸ�, �������� �����Ѵ�.
		 *
		 */
		Scanner sc = new Scanner(System.in);

		boolean arr[] = new boolean[10001];

		// �����佺�׳׽��� ü
		for(int i = 0; i <= 10000; i++) {
			arr[i] = true;
		}

		for(int i = 2; i <= 10000; i++) {
			for(int j = i * 2; j <= 10000; j = j + i) {
				if(arr[j] == true) {
					arr[j] = false;
				}
			}
		}

		int t = sc.nextInt();

		for(int seq = 0; seq < t; seq++) {
			int n = sc.nextInt();

			int max = n / 2;
			int gap = n - 2;
			int pMin = 0;
			int pMax = 0;

			for(int i = 2; i <= max; i++) {
				if(arr[i] == true && arr[n - i] == true) {
					pMin = i;
					pMax = n - i;

					// �� �Ҽ��� ���̰� ���� ���� ���� ���
					if(gap >= (pMax - pMin)) {
						gap = pMax - pMin;
					}
				}
			}

			System.out.println(pMin + " " + pMax);
		}

		sc.close();
	}
}