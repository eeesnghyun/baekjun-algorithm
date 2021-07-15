package com.baek.algo;

import java.util.Scanner;

public class Q2839 {

	public static void main(String[] args) {
		/*
		 * Q. ������ ��Ȯ�ϰ� Nų�α׷� ����ؾ� �� ��, ���� �� ���� �������� �Ǵ��� �� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 *
		 * �Է�
		 * - ù° �ٿ� N�� �־�����.
		 *
		 * ����
		 * - 3 �� N �� 5000
		 * - ������ 3ų�α׷� ������ 5ų�α׷� ������ �ִ�.
		 * - ������ �ּ� ������ ����Ѵ�. ���� ��Ȯ�ϰ� Nų�α׷��� ���� �� ���ٸ� -1�� ����Ѵ�.
		 *   Ex) 18ų�α׷� ������ ����ؾ� �� ��, 3ų�α׷� ���� 6���� �������� ������ 5ų�α׷� 3���� 3ų�α׷� 1���� ����ϸ� �� ���� ������ ������ ����� �� �ִ�.
		 */
		Scanner sc = new Scanner(System.in);

		int n  = sc.nextInt();
		int k3 = 0;
		int k5 = n / 5;
		int result = 0;

		while(true) {
			if(n % 5 == 0) {
				result = k3 + k5;
				break;
			}

			n  = n - 3;
			k3 = k3 + 1;

			if(n < 0) {
				result = -1;
				break;
			}
		}

		System.out.println(result);

		sc.close();
	}
}