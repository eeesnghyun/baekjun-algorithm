package com.baek.algo;

import java.util.Scanner;

public class Q1316 {

	public static void main(String[] args) {
		/*
		 * Q. 단어 N개를 입력으로 받아 그룹 단어의 개수를 출력하는 프로그램을 작성하시오.
		 *
		 * 입력
		 * - 첫째줄 단어의 개수 N개가 주어진다.
		 * - 둘째줄 N개의 단어가 주어진다.
		 *
		 * 조건
		 * - N은 100보다 작거나 같은 자연수이다.
		 * - 주어진 단어는 알파벳 소문자로만 되어있고 중복되지 않는다.
		 * - 그룹 단어란 단어에 존재하는 모든 문자에 대해서, 각 문자가 연속해서 나타나는 경우만을 말한다.
		 *   Ex) ccazzzzbb => cazb 연속(그룹 단어)
		 *   	 abc 	   => abc 연속(그룹 단어)
		 *   	 test 	   => t가 떨어져 나타남(그룹 단어X)
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

			// 1. 입력받은 문자 중 중복 문자 제거
			for(int j = 0; j < inputWord.length(); j++) {
				if(inputWord.indexOf(inputWord.charAt(j)) == j) {
					newWord = newWord + inputWord.charAt(j);
				}
			}

			// 2. 중복제거된 문자와 입력받은 문자 비교
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