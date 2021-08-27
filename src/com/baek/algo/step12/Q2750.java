package com.baek.algo.step12;

import java.util.Arrays;
import java.util.Scanner;

public class Q2750 {

	public static void main(String[] args) {
		/*
		 * Q. N���� ���� �־����� ��, �̸� ������������ �����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 *
		 * �Է�
		 * - ù° �ٿ� ���� ���� N(1 �� N �� 1,000)�� �־�����.
		 * - ��° �ٺ��� N���� �ٿ��� �� �־�����.
		 *
		 * ����
		 * - �� ���� ������ 1,000���� �۰ų� ���� �����̴�. ���� �ߺ����� �ʴ´�.
		 * - ù° �ٺ��� N���� �ٿ� ������������ ������ ����� �� �ٿ� �ϳ��� ����Ѵ�.
		 */
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] arr = new int[n];

		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		for(int i = 0; i < n; i++) {
			for(int j = i + 1; j < n; j++) {
				if(j == n) {
					break;
				}

				if(arr[i] > arr[j]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}

			System.out.println(arr[i]);
		}

		sc.close();
	}
}