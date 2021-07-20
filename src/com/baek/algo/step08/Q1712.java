package com.baek.algo.step08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1712 {

	public static void main(String[] args) throws IOException {
		/*
		 * Q. �������ڴ� ��Ʈ���� �����ϰ� �Ǹ��ϴ� ȸ���̴�.
		 *    ��Ʈ�� �Ǹ� ����� ������� �ų� A������ ���� ����� ���, �� ���� ��Ʈ���� �����ϴ� ������ �� B������ ���� ����� ��ٰ� �Ѵ�.
		 *    ��Ʈ�� �Ǹ� ������ C��� ���� ��, ���ͺб���(�� ������ �� ��뺸�� �������� �Ǵ� ����)�� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 *
		 * �Է�
		 * - ù° �ٿ� A, B, C�� �� ĭ�� ���̿� �ΰ� ������� �־�����.
		 * - A : ���� ���
		 * - B : ���� ���
		 * - C : �Ǹ� ����
		 *
		 * ����
		 * - A, B, C�� 21�� ������ �ڿ����̴�.
		 * - ù ��° �ٿ� ���ͺб��� �� ���ʷ� ������ �߻��ϴ� �Ǹŷ��� ����Ѵ�. ���ͺб����� �������� ������ -1�� ����Ѵ�.
		 */
		BufferedReader bf  = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine(), " ");

		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		int point = 1;

		/*
		 * 1. a + (b * i) < c * i
		 * 2. a/i + b < c
		 * 3. a/i < c - b
		 * 4. a < (c - b) * i
		 * 5. (170 - 70) * i = 1000
		 * 6. i = 10
		 */

		// ���� ����� �Ǹ� ���ݺ��� ���ų� ���ٸ� ���ͺб����� �������� ����
		if(b >= c) {
			point = -1;
		} else {
			point = (a / (c - b)) + 1;
		}

		System.out.println(point);

		bf.close();
	}
}