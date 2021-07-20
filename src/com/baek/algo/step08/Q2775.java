package com.baek.algo.step08;

import java.util.Scanner;

public class Q2775 {

	public static void main(String[] args) {
		/*
		 * Q. �Ʒ� ���ǰ� ���� ����Ʈ�� ���� ��, k�� nȣ���� �� ���� ��� �ִ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 *
		 * �Է�
		 * - ù ��° �ٿ� �׽�Ʈ ���̽� T�� �־�����.
		 * - ������ ���̽����� ù ��° �ٿ� ���� K, �� ��° �ٿ� ���� N�� �־�����.
		 *
		 * ����
		 * - 1 �� K, N �� 14
		 * - K�� Nȣ�� ����� �ڽ��� �Ʒ�(K-1)���� 1ȣ���� Nȣ���� ������� ���� �ո�ŭ ������� ��ƾ��Ѵ�.
		 * - ����Ʈ�� 0������ �ְ� ������ 1ȣ���� ������ 0���� iȣ���� i���� ���.
		 */
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();

		for(int i = 0; i < t; i++) {
			int k = sc.nextInt();
			int n = sc.nextInt();

			if(n >= 14) n = 14;

			int[][] arr = new int[k + 1][n];

			for(int x = 0; x <= k; x++) {
				for(int y = 0; y < n; y++) {
					int sum = 0;

					if(x == 0) {
						arr[x][y] = y + 1;
					} else {
						for(int j = 0; j <= y; j++) {
							sum = sum + arr[x-1][j];
						}
						arr[x][y] = sum;
					}
				}
			}

			System.out.println(arr[k][n-1]);
		}

		sc.close();
	}
}