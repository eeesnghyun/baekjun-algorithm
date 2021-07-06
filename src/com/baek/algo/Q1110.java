package com.baek.algo;

import java.util.Scanner;

public class Q1110 {

	public static void main(String[] args) {
		/*
		 * Q. N�� �־����� ��, N�� ����Ŭ�� ���̸� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 *
		 * �Է�
		 * - ���� N�� �־�����.
		 *
		 * ����
		 * - N�� 0���� ũ�ų� ����, 99���� �۰ų� ���� �����̴�.
		 * - ������ �־��� �� ������ ���� ������ �� �� �ִ�.
		 * - �־��� ���� 10���� �۴ٸ� �տ� 0�� �ٿ� �� �ڸ� ���� �����, �� �ڸ��� ���ڸ� ���Ѵ�. �׸��� 
		 *   �־��� ���� ���� ������ �ڸ� ���� �տ��� ���� ���� ���� ������ �ڸ� ���� �̾� �ٿ� ���ο� ���� �����.
		 *   �ݺ� ������ ���� ���� N�� �Ǵ� ����Ŭ�� ���Ѵ�.
		 *   Ex) 26 => 2+6=8(0+8) : 1
		 * 		    => 6+8=14	  : 2
		 * 			=> 8+4=12	  : 3
		 * 			=> 4+2=6(0+6) : 4(END)
		 * 			=> 2+6=8(0+8) : ����
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