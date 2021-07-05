package com.baek.algo;

import java.util.Scanner;

public class Q10871 {

	public static void main(String[] args) {
		/*
		 * Q. ���� N���� �̷���� ���� A�� ���� X�� �־�����. �̶�, A���� X���� ���� ���� ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 *
		 * �Է�
		 * - ù° �ٿ� N�� X�� �־�����. (1 �� N, X �� 10,000)
		 * - ��° �ٿ� ���� A�� �̷�� ���� N���� �־�����. �־����� ������ ��� 1���� ũ�ų� ����, 10,000���� �۰ų� ���� �����̴�.
		 *
		 * ����
		 * - X���� ���� ���� �Է¹��� ������� �������� ������ ����Ѵ�. X���� ���� ���� ��� �ϳ� �����Ѵ�.
		 *
		 */
		Scanner sc = new Scanner(System.in);

		int numN = sc.nextInt();
		int numX = sc.nextInt();
		int[] arr = new int[numN];
		String result = "";

		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		for(int i = 0; i < arr.length; i++) {
			if(arr[i] < numX) {
				result = result + arr[i] + " ";
			}
		}

		System.out.println(result.substring(0, (result.length()-1)));

		sc.close();
	}
}