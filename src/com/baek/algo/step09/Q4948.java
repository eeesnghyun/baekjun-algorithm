package com.baek.algo.step09;

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
		 * - 1 �� n �� 123456
		 */
		Scanner sc = new Scanner(System.in);

		boolean arr[] = new boolean[246913];

		while(true) {
			int n = sc.nextInt();
			int cnt = 0;

			if(n == 0) {
				break;
			} else {
				int max = n * 2;

				// �����佺�׳׽��� ü
				for(int i = 2; i <= max; i++) {
					arr[i] = true;
				}

				for(int i = 2; i <= max; i++) {
					for(int j = i * 2; j <= max; j = j + i) {
						if(arr[j] == true) {
							arr[j] = false;
						}
					}
				}

				// n���� ũ�� 2n���� ���� �Ҽ��� ����
				for(int k = n + 1; k <= max; k++) {
					if(arr[k] == true) {
						cnt = cnt + 1;
					}
				}

				System.out.println(cnt);
			}
		}

		sc.close();
	}
}