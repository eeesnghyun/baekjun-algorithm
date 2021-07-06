package com.baek.algo;

import java.util.Scanner;

public class Q1065 {

	public static void main(String[] args) {
		/*
		 * Q. N�� �־����� ��, 1���� ũ�ų� ����, N���� �۰ų� ���� �Ѽ��� ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 *
		 * �Է�
		 * - 1000���� �۰ų� ���� �ڿ��� N�� �־�����.
		 *
		 * ����
		 * - � ���� ���� X�� �� �ڸ��� ���������� �̷�ٸ�, �� ���� �Ѽ���� �Ѵ�.
		 * - ���������� ���ӵ� �� ���� ���� ���̰� ������ ������ ���Ѵ�.
		 */
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int x = 1;
		int hansu = 0;

		while(true) {
			if(x < 100) {
				hansu = x;
			} else if(x >= 100 & x <= 1000) {
				int a = x / 100;
				int b = x / 10 % 10;
				int c = x % 10;

				if((a - b) == (b - c)) {
					hansu = hansu + 1;
				}
			}

			if(x == n || n > 1000) {
				break;
			}

			x = x + 1;
		}

		System.out.println(hansu);

		sc.close();
	}
}