package com.baek.algo.step11;

import java.util.Scanner;

public class Q2231 {

	public static void main(String[] args) {
		/*
		 * Q. � �ڿ��� N�� ���� ��, �� �ڿ��� N�� �������� N�� N�� �̷�� �� �ڸ����� ���� �ǹ��Ѵ�.
		 * � �ڿ��� M�� �������� N�� ���, M�� N�� �����ڶ� �Ѵ�. ���� ���, 245�� �������� 256(=245+2+4+5)�� �ȴ�.
		 * ���� 245�� 256�� �����ڰ� �ȴ�. ����, � �ڿ����� ��쿡�� �����ڰ� ���� ���� �ִ�. �ݴ��, �����ڰ� ���� ���� �ڿ����� ���� �� �ִ�.
		 * �ڿ��� N�� �־����� ��, N�� ���� ���� �����ڸ� ���س��� ���α׷��� �ۼ��Ͻÿ�.
		 *
		 * �Է�
		 * - ù° �ٿ� �ڿ��� N(1 �� N �� 1,000,000)�� �־�����.
		 *
		 * ����
		 * - ù° �ٿ� ���� ����Ѵ�. �����ڰ� ���� ��쿡�� 0�� ����Ѵ�.
		 */
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int result = 0;

		for(int i = 1; i < n; i++) {
			int num = i;
			int sum = 0;

			while(true) {
				sum = sum + (num % 10);
				num = num / 10;

				if(num == 0) {
					break;
				}
			}

			if(n == (sum + i)) {
				result = i;
				break;
			}
		}

		System.out.println(result);

		sc.close();
	}
}