package com.baek.algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q4344 {

	public static void main(String[] args) throws IOException {
		/*
		 * Q. �л����� ��� ������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 *
		 * �Է�
		 * - ù° �ٿ��� �׽�Ʈ ���̽��� ���� C�� �־�����.
		 * - ��° �ٺ��� �� �׽�Ʈ ���̽����� �л��� �� N�� ù ���� �־�����, �̾ N���� ������ �־�����.
		 *
		 * ����
		 * - �л��� �� N�� 1 �� N �� 1000�� �����̴�.
		 * - ������ 0���� ũ�ų� ����, 100���� �۰ų� ���� �����̴�.
		 * - �� ���̽����� �� �پ� ����� �Ѵ� �л����� ������ �ݿø��Ͽ� �Ҽ��� ��° �ڸ����� ����Ѵ�.(������X)
		 */
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		int c = Integer.parseInt(bf.readLine());		// �׽�Ʈ ���̽� ��

		for(int i = 0; i < c; i++) {
			String arr[] = bf.readLine().split(" ");

			int n   = Integer.parseInt(arr[0]);			// �л���
			int sum = 0;
			int cnt = 0;

			for(int j = 1; j <= n; j++) {
				int score = Integer.parseInt(arr[j]);	// ����

				sum = sum + score;
			}

			double avg = sum / n;	// ���

			for(int j = 1; j <= n; j++) {
				int score = Integer.parseInt(arr[j]);

				if(avg < score) {
					cnt = cnt + 1;
				}
			}

			double rate = (double) cnt / (double) n * 100;	// ����

			System.out.printf("%.3f%%\n", rate);
		}

		bf.close();
	}
}