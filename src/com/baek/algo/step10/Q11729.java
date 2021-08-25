package com.baek.algo.step10;

import java.util.Scanner;

public class Q11729 {

	private static int cnt = 0;
	private static StringBuffer sb = new StringBuffer();

	private static void hanoi(int n, int left, int center, int right) {
		cnt = cnt + 1;

		if(n == 1) {
			sb.append(left + " " + right + "\n");
		} else {
			hanoi(n-1, left, right, center);

			sb.append(left + " " + right + "\n");

			hanoi(n-1, center, left, right);
		}
	}

	public static void main(String[] args) {
		/*
		 * Q. �ϳ���ž �̵� ���� ����
		 *    �� ���� ��밡 �ְ� ù ��° ��뿡�� �ݰ��� ���� �ٸ� n���� ������ �׿� �ִ�.
		 *    �� ������ �ݰ��� ū ������� �׿��ִ�. ���� �����µ��� ���� ��Ģ�� ���� ù ��° ��뿡��
		 *    �� ��° ���� �ű�� �Ѵ�.
		 *
		 * �Է�
		 * - ù° �ٿ� ù ��° ��뿡 ���� ������ ���� N�� �־�����.
		 *
		 * ����
		 * - 1 �� N �� 20
		 * - ù° �ٿ� �ű� Ƚ�� K�� ����Ѵ�.
		 * - �� ���� �� ���� ���Ǹ��� �ٸ� ž���� �ű� �� �ִ�. �׾� ���� ������ �׻� ���� ���� �Ʒ��� �ͺ��� �۾ƾ� �Ѵ�.
		 * - �� ��° �ٺ��� ���� ������ ����Ѵ�. �� ��° �ٺ��� K���� �ٿ� ���� �� ���� A B�� ��ĭ�� ���̿�
		 *   �ΰ� ����ϴµ�, �̴� A��° ž�� ���� ���� �ִ� ������ B��° ž�� ���� ���� �ű�ٴ� ���̴�.
		 */
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		hanoi(n, 1, 2, 3);

		System.out.println(cnt);
		System.out.println(sb.toString());

		sc.close();
	}
}