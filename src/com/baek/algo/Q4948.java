package com.baek.algo;

import java.util.Scanner;

public class Q4948 {

	public static void main(String[] args) {
		/*
		 * Q. ����Ʈ�� ������ ������ �ڿ��� n�� ���Ͽ�, n���� ũ��, 2n���� �۰ų� ���� �Ҽ��� ��� �ϳ� �����Ѵٴ� ������ ��� �ִ�.
		 *    �� ������ ������ ����Ʈ���� 1845�⿡ �����߰�, ������Ƽ ü������� 1850�⿡ �����ߴ�.
		 *    �ڿ��� n�� �־����� ��, n���� ũ��, 2n���� �۰ų� ���� �Ҽ��� ������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 *
		 * �Է�
		 * - �Է��� ���� ���� �׽�Ʈ ���̽��� �̷���� �ִ�. �� ���̽��� n�� �����ϴ� �� �ٷ� �̷���� �ִ�.
		 * - �Է��� ���������� 0�� �־�����.
		 *
		 * ����
		 * - �� �׽�Ʈ ���̽��� ���ؼ� n���� ũ�� 2n���� �۰ų� ���� �Ҽ��� ������ ����Ѵ�.
		 */
		Scanner sc = new Scanner(System.in);

		while(true) {
			int n = sc.nextInt();

			if(n == 0) {
				break;
			} else {
				// �ð� �ʰ�
				// ��Ʈ : �����佺�׳׽��� ü
				// 120���� �۰ų� ���� �� ��� 2,3,5,7�� ����� ����� ���� ���� ��� �Ҽ��̴�.
				int min = n + 1;
				int max = n * 2;
				int cnt = 0;

				for(int i = min; i <= max; i++) {
					boolean pNum = true;

					if(i > 1) {
						if(i % 2 != 0) {
							for(int j = 2; j < i; j++) {
								if(i % j == 0) {
									pNum = false;
									break;
								}
							}

							if(pNum == true) {
								cnt = cnt + 1;
							}
						}
					}
				}
				System.out.println(cnt);
			}
		}

		sc.close();
	}
}