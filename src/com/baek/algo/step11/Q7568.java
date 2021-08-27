package com.baek.algo.step11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q7568 {

	public static void main(String[] args) throws IOException {
		/*
		 * Q. ��ġ ���ϱ�
		 * �� ��� A �� B�� ��ġ�� ���� (x, y), (p, q)��� �� �� x > p �׸��� y > q �̶�� �츮�� A�� ��ġ�� B�� ��ġ���� "�� ũ��"�� ���Ѵ�.
		 * ���� ��� � A, B �� ����� ��ġ�� ���� (56, 177), (45, 165)��� �Ѵٸ� A�� ��ġ�� B���� ū ���� �ȴ�. �׷��� ���� �ٸ� ��ġ���� ũ�⸦ ���� �� ���� ��쵵 �ִ�.
		 * ���� ��� �� ��� C�� D�� ��ġ�� ���� (45, 181), (55, 173)�̶�� �����Դ� D�� C���� �� ���̰�, Ű�� C�� �� ũ�Ƿ�, "��ġ"�θ� �� �� C�� D�� ������ ���溸�� �� ũ�ٰ� ���� �� ����.
		 * �л� N���� �����Կ� Ű�� ��� �Է��� �о �� ����� ��ġ ����� ����Ͽ� ����ؾ� �Ѵ�.
		 * N���� ���ܿ��� �� ����� ��ġ ����� �ڽź��� �� "ū ��ġ"�� ����� ���� ��������.
		 * ���� �ڽź��� �� ū ��ġ�� ����� k���̶�� �� ����� ��ġ ����� k+1�� �ȴ�. �̷��� ����� �����ϸ� ���� ��ġ ����� ���� ����� ���� �� �����ϴ�.
		 *
		 * �Է�
		 * - ù �ٿ��� ��ü ����� �� N�� �־�����. �׸��� �̾����� N���� �ٿ��� �� ����� �����Կ� Ű�� ��Ÿ���� ���� ���� x�� y�� �ϳ��� ������ �ΰ� ���� ��Ÿ����.
		 *
		 * ����
		 * - ������ ����� ��ġ ����� ���ؼ� �� ������� ù �ٿ� ����ؾ� �Ѵ�. ��, �� ��ġ ����� ���鹮�ڷ� �и��Ǿ�� �Ѵ�.
		 */
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(bf.readLine());

		/*
		 * A (55, 185) 2
		 * B (58, 183) 2
		 * C (88, 186) 1
		 * D (60, 175) 2
		 * E (46, 155) 5
		 */
		int[][] p = new int[n][3];
		int k   = 1;
		int cnt = 0;

		for(int i = 0; i < n; i++) {
			StringTokenizer st  = new StringTokenizer(bf.readLine(), " ");

			for(int j = 0; j < 2; j++) {
				p[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		for(int i = 0; i < n; i++) {
			int weight1 = p[i][0];
			int height1 = p[i][1];

			for(int j = 0; j < n; j++) {
				if(i != j) {
					int weight2 = p[j][0];
					int height2 = p[j][1];

					if(weight1 < weight2 && height1 < height2) {
						cnt = cnt + 1;
					}
				}
			}

			p[i][2] = k + cnt;
			cnt = 0;
			System.out.print(p[i][2] + " ");
		}

		bf.close();
	}
}