package com.baek.algo.step12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q2751 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		/*
		 * Q. N���� ���� �־����� ��, �̸� ������������ �����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 *
		 * �Է�
		 * - ù° �ٿ� ���� ���� N(1 �� N �� 1,000,000)�� �־�����.
		 * - ��° �ٺ��� N���� �ٿ��� ���� �־�����.
		 *
		 * ����
		 * - ������ 1,000,000���� �۰ų� ���� �����̴�.
		 * - ���� �ߺ����� �ʴ´�.
		 * - ù° �ٺ��� N���� �ٿ� ������������ ������ ����� �� �ٿ� �ϳ��� ����Ѵ�.
		 * - ���ѽð� 2��
		 */
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb  = new StringBuilder();

		int n = Integer.parseInt(bf.readLine());

		List<Integer> list = new ArrayList<Integer>();

		for(int i = 0; i < n; i++) {
			list.add(Integer.parseInt(bf.readLine()));
		}

		Collections.sort(list);

		for(int num : list) {
			sb.append(num).append("\n");
		}

		System.out.println(sb);

		bf.close();
	}
}