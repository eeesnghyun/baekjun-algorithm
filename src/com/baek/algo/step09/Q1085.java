package com.baek.algo.step09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1085 {

	public static void main(String[] args) throws IOException {
		/*
		 * Q. �Ѽ��� ���� (x, y)�� �ִ�. ���簢���� ���� �Ʒ� �������� (0, 0)�� �ְ�, ������ �� �������� (w, h)�� �ִ�.
		 *    ���簢���� ��輱���� ���� �Ÿ��� �ּڰ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 *
		 * �Է�
		 * - ù° �ٿ� x, y, w, h�� �־�����.
		 *
		 * ����
		 * - 1 �� w, h �� 1000
		 * - 1 �� x �� w-1
		 * - 1 �� y �� h-1
		 * - x, y, w, h�� ����
		 */
		BufferedReader bf  = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine(), " ");

		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());



		bf.close();
	}
}