package com.baek.algo.step09;

import java.util.Scanner;

public class Q1978 {

	public static void main(String[] args) {
		/*
		 * Q. �־��� �� N�� �߿��� �Ҽ��� �� ������ ã�Ƽ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 *
		 * �Է�
		 * - ù �ٿ� ���� ���� N�� �־�����.
		 * - ��° �ٿ� N���� ���� �־�����.
		 *
		 * ����
		 * - N�� 100�����̴�.
		 * - N���� ���� 1000������ �ڿ����̴�.
		 */
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int cnt = 0;

		for(int i = 0; i < n; i++) {
			int num = sc.nextInt();

			// �Ҽ� : 1���� ū �ڿ��� �� 1�� �ڱ� �ڽŸ��� ����� ���� ��
			if(num > 1) {
				boolean pNum = true;

				for(int j = 1; j <= num; j++) {
					if(j != 1 && j != num) {
						if(num % j == 0) {
							pNum = false;
							break;
						}
					}
				}

				if(pNum == true) {
					cnt = cnt + 1;
				}
			}
		}

		System.out.println(cnt);

		sc.close();
	}
}