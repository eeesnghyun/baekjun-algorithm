package com.baek.algo;

import java.util.Scanner;

public class Q2884 {

	public static void main(String[] args) {
		/*
		 * Q. 45�� ���� �����Ǵ� �˶� ���α׷��� �ۼ��Ͻÿ�.
		 *
		 * �Է�
		 * - �� ����(H, M)
		 *
		 * ����
		 * - ù° �ٿ� �� ���� H�� M�� �־�����. (0 �� H �� 23, 0 �� M �� 59) �׸��� �̰��� ���� ����̰� ������ ���� �˶� �ð� H�� M���� �ǹ��Ѵ�.
		 * - �Է� �ð��� 24�ð� ǥ���� ����Ѵ�. 24�ð� ǥ������ �Ϸ��� ������ 0:0(����)�̰�, ���� 23:59(������ ���� 1�� ��)�̴�. �ð��� ��Ÿ�� ��, ���ʿ��� 0�� ������� �ʴ´�.
		 */
		Scanner sc = new Scanner(System.in);

		int hh = sc.nextInt();
		int mm = sc.nextInt();

		int rh = 0;
		int rm = 0;

		if(mm < 45) {
			if(hh == 0) {
				rh = 23;
			} else {
				rh = hh - 1;
			}
			rm = (mm + 60) - 45;
		} else {
			rh = hh;
			rm = mm - 45;
		}

		System.out.println(rh + " " + rm);

		sc.close();
	}
}