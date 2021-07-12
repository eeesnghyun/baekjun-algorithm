package com.baek.algo;

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
		 * - 1 �� k, n �� 14
		 * - k�� nȣ�� ����� �ڽ��� �Ʒ�(k-1)���� 1ȣ���� nȣ���� ������� ���� �ո�ŭ ������� ��ƾ��Ѵ�.
		 * - ����Ʈ�� 0������ �ְ� ������ 1ȣ���� ������ 0���� iȣ���� i���� ���.
		 */
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();
		int k = sc.nextInt();
		int n = sc.nextInt();

		int cnt = 0;
		int x = n;
		int y = k + (n-1);

		if((k - 1) != 0) {
			for(int i = 0; i < k - 1; i++) {
				System.out.println("i : " + i);
				System.out.println(x);
				x = x + (n + i);
			}
		}

		cnt = x + y;

		System.out.println("k : " + k);
		System.out.println("n : " + n);
		System.out.println("x : " + x);
		System.out.println("y : " + y);

		System.out.println(cnt);

		sc.close();
	}
}