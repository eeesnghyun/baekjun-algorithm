package com.baek.algo;

import java.util.Scanner;

public class Q1110 {

	public static void main(String[] args) {
		/*
		 * Q. N이 주어졌을 때, N의 사이클의 길이를 구하는 프로그램을 작성하시오.
		 *
		 * 입력
		 * - 정수 N이 주어진다.
		 *
		 * 조건
		 * - N은 0보다 크거나 같고, 99보다 작거나 같은 정수이다.
		 * - 정수가 주어질 때 다음과 같은 연산을 할 수 있다.
		 * - 주어진 수가 10보다 작다면 앞에 0을 붙여 두 자리 수로 만들고, 각 자리의 숫자를 더한다. 그리고 
		 *   주어진 수의 가장 오른쪽 자리 수와 앞에서 구한 합의 가장 오른쪽 자리 수를 이어 붙여 새로운 수를 만든다.
		 *   반복 과정을 통해 최초 N이 되는 사이클을 구한다.
		 *   Ex) 26 => 2+6=8(0+8) : 1
		 * 		    => 6+8=14	  : 2
		 * 			=> 8+4=12	  : 3
		 * 			=> 4+2=6(0+6) : 4(END)
		 * 			=> 2+6=8(0+8) : 원점
		 */
		Scanner sc = new Scanner(System.in);

		int num   = sc.nextInt();
		int start = num;
		int cycle = 1;

		sc.close();

		while(true) {
			String sumTxt = "";

			int lNum = start / 10;
			int rNum = start % 10;
			int sum  = lNum + rNum;

			if(sum < 10) {
				sumTxt = "0" + Integer.toString(sum);
			} else {
				sumTxt = Integer.toString(sum);
			}

			int rSum = Integer.parseInt(sumTxt) % 10;

			String newNum = Integer.toString(rNum) + Integer.toString(rSum);

			if(num == Integer.parseInt(newNum)) {
				break;
			}

			start = Integer.parseInt(newNum);
			cycle = cycle + 1;
		}
		System.out.println(cycle);
	}
}