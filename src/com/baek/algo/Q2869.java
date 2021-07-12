package com.baek.algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2869 {

	public static void main(String[] args) throws IOException {
		/*
		 * Q. �� ���� �����̰� �ִ�. �� �����̴� ���̰� V������ ���� ���븦 �ö󰡷��� �Ѵ�.
		 * 	  �����̴� ���� A���͸� �ö󰡰� �㿡 B���� �̲�������.
		 *    �����̰� ���� ���븦 ��� �ö󰡷���, ��ĥ�� �ɸ����� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 *
		 * �Է�
		 * - �� ���� A, B, V�� �������� ���еǾ �־�����.
		 *
		 * ����
		 * - 1 �� B < A �� V �� 1000000000
		 * - ���� �ö� �Ŀ��� �̲������� �ʴ´�.
		 * - �ð����� 0.15��
		 */
		BufferedReader bf  = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine(), " ");

		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int v = Integer.parseInt(st.nextToken());

		int day = (v - b) / (a - b);

		if(((v - b) % (a - b)) != 0) {
			day = day + 1;
		}

		System.out.println(day);

		bf.close();
	}
}