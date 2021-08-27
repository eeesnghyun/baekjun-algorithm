package com.baek.algo.step11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2798 {

	public static void main(String[] args) throws IOException {
		/*
		 * Q. ���� ����
		 * 	  �� ī�忡�� ���� ������ ���� �ִ�. �� ����, ������ N���� ī�带 ��� ���ڰ� ���̵��� �ٴڿ� ���´�. �׷� �Ŀ� ������ ���� M�� ũ�� ��ģ��.
		 * 	  ���� �÷��̾�� ���ѵ� �ð� �ȿ� N���� ī�� �߿��� 3���� ī�带 ���� �Ѵ�. ���� ���� �����̱� ������, �÷��̾ �� ī���� ���� M�� ���� �����鼭 M�� �ִ��� ������ ������ �Ѵ�.
 		 *    N���� ī�忡 ���� �ִ� ���ڰ� �־����� ��, M�� ���� �����鼭 M�� �ִ��� ����� ī�� 3���� ���� ���� ����Ͻÿ�.
 		 *
 		 * �Է�
 		 * - ù° �ٿ� ī���� ���� N�� M�� �־�����.
 		 * - ��° �ٿ��� ī�忡 ���� �ִ� ���� �־�����, �� ���� 100,000�� ���� �ʴ� ���� �����̴�.
 		 *
 		 * ����
 		 * - 3 �� N �� 100
 		 * - 10 �� M �� 300,000
 		 * - ù° �ٿ� M�� ���� �����鼭 M�� �ִ��� ����� ī�� 3���� ���� ����Ѵ�.
		 */
		BufferedReader bf   = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st  = new StringTokenizer(bf.readLine(), " ");
		StringTokenizer st2 = new StringTokenizer(bf.readLine(), " ");

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int[] card = new int[n];
		int min = 0;
		int sum = 0;
		int result = 0;

		for(int i = 0; i < n; i ++) {
			card[i] = Integer.parseInt(st2.nextToken());
		}

		/**
		 * n : 5 / m : 21
		 * card - [0]:3
		 * 		  [1]:9
		 * 		  [2]:5
		 *        [3]:8
		 *        [4]:12
		 */
		for(int i = 0; i < n - 2; i++) {
			for(int j = i + 1; j < n - 1; j++) {
				for(int h = j + 1; h < n; h++) {
					// 3 9 5  : 17
					// 3 9 8  : 20
					// 3 9 12 : 24
					// 3 5 8  : 16
					// 3 5 12 : 20
					// 3 8 12 : 23
					// 9 5 8  : 22
					// 9 5 12 : 26
					// 9 8 12 : 29
					// 5 8 12 : 25
					sum = card[i] + card[j] + card[h];

					if(sum <= m && sum >= min) {
						min = sum;
						result = sum;
					}
				}
			}
		}

		System.out.println(result);

		bf.close();
	}
}