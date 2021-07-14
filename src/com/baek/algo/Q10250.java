package com.baek.algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q10250 {

	public static void main(String[] args) throws IOException {
		/*
		 * Q. ACM ȣ�� �Ŵ��� ����� �մ��� �����ϴ� ��� �� ���� �����ϰ� �ִ�.
		 *    �� �������翡 ������ �մԵ��� ȣ�� �������κ��� �ɾ ���� ª�� �Ÿ��� �ִ� ���� ��ȣ�Ѵٰ� �Ѵ�.
		 *    ȣ�� ������ ���� ���������� �ٷ� �տ� �ִµ�, �������� ���������ͱ����� �Ÿ��� �����Ѵ�.
		 *    �������� ��� ��� ȣ�� �������κ��� �ȴ� �Ÿ��� ���� ª���� ���� �����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 *
		 * �Է�
		 * - ù �ٿ� �׽�Ʈ ������ ���� T�� �־�����.
		 * - ȣ���� �� ��, �� ���� �� ��, ���° �մ������� ��Ÿ���� �� ���� H, W, N�� �־�����.
		 *
		 * ����
		 * - 1 �� H, W �� 99, 1 �� N �� H �� W
		 * - ȣ���� ���簢�� ����̰� �� ���� W ���� ���� �ִ� H �� �ǹ��̴�.
		 * - ��� ������ �� �� ������ �Ÿ��� ���� �Ÿ�(�Ÿ� 1)��� �����Ѵ�.
		 * - ��� ���� ����ִٰ� �����ϰ� N ��°�� ������ �մԿ��� ������ �� ��ȣ�� ����Ѵ�.
		 *   Ex) ...
		 *       301 302 303 304 305
		 *       201 202 203 204 205
		 *       101 102 103 104 105 ...
		 *       6��° �մ� : 302ȣ ����
		 */
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(bf.readLine());

		for(int i = 0; i < t; i++) {
			String arr[] = bf.readLine().split(" ");

			int h = Integer.parseInt(arr[0]);
			int w = Integer.parseInt(arr[1]);
			int n = Integer.parseInt(arr[2]);

			int room   = 0;
			int floor  = n % h;
			int number = (n / h) + 1;

			if(floor == 0) {
				room = (h * 100) + (n / h);
			} else {
				room = (floor * 100) + number;
			}

			System.out.println(room);
		}

		bf.close();
	}
}