package com.baek.algo;

import java.util.Scanner;

public class Q1316 {

	public static void main(String[] args) {
		/*
		 * Q. �ܾ� N���� �Է����� �޾� �׷� �ܾ��� ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 *
		 * �Է�
		 * - ù°�� �ܾ��� ���� N���� �־�����.
		 * - ��°�� N���� �ܾ �־�����.
		 *
		 * ����
		 * - N�� 100���� �۰ų� ���� �ڿ����̴�.
		 * - �־��� �ܾ�� ���ĺ� �ҹ��ڷθ� �Ǿ��ְ� �ߺ����� �ʴ´�.
		 * - �׷� �ܾ�� �ܾ �����ϴ� ��� ���ڿ� ���ؼ�, �� ���ڰ� �����ؼ� ��Ÿ���� ��츸�� ���Ѵ�.
		 *   Ex) ccazzzzbb => cazb ����(�׷� �ܾ�)
		 *   	 abc 	   => abc ����(�׷� �ܾ�)
		 *   	 test 	   => t�� ������ ��Ÿ��(�׷� �ܾ�X)
		 */
		Scanner sc = new Scanner(System.in);

		int n   = sc.nextInt();
		int cnt = 0;

		String wordArr[] = new String[n];

		for(int seq = 0; seq < n; seq++) {
			wordArr[seq] = sc.next();
		}

		for(int i = 0; i < wordArr.length; i++) {
			int pos = 0;

			String inputWord = wordArr[i].toLowerCase();
			String newWord   = "";

			// 1. �Է¹��� ���� �� �ߺ� ���� ����
			for(int j = 0; j < inputWord.length(); j++) {
				if(inputWord.indexOf(inputWord.charAt(j)) == j) {
					newWord = newWord + inputWord.charAt(j);
				}
			}

			// 2. �ߺ����ŵ� ���ڿ� �Է¹��� ���� ��
			String inputWordArr[] = inputWord.split("");
			String newWordArr[]   = newWord.split("");

			for(int h = 0; h < newWordArr.length; h++) {
				String text = newWordArr[h];

				for(int k = pos; k < inputWordArr.length; k++) {
					if(!text.equals(inputWordArr[k])) {
						pos = k;
						break;
					}
				}
			}

			if(newWordArr[newWordArr.length - 1].equals(inputWordArr[pos])) {
				cnt = cnt + 1;
			}
		}

		System.out.println(cnt);

		sc.close();
	}
}