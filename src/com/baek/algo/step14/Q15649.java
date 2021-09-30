package com.baek.algo.step14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.StringTokenizer;

public class Q15649 {

	static int arr[];
	static boolean check[];

	public static void dfs(int n, int m, int depth) {
		if(depth == m) {
//			for(int i = 0; i < m; i++) {
//
//			}
		}
		
		
		
		
		for(int i = 0; i < n; i++) {
			if(check[i] == false) {
				check[i] = true;

				arr[depth] = i;

				dfs(n, m, depth + 1);

				check[i] = false;
			}
		}
	}

	public static void main(String[] args) throws IOException {
		/*
		 * Q. �ڿ��� N�� M�� �־����� ��, �Ʒ� ������ �����ϴ� ���̰� M�� ������ ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 *    1���� N���� �ڿ��� �߿��� �ߺ� ���� M���� �� ����
		 *
		 * �Է�
		 * - ù° �ٿ� �ڿ��� N�� M�� �־�����. (1 �� M �� N �� 8)
		 *
		 * ����
		 * - �� �ٿ� �ϳ��� ������ ������ �����ϴ� ������ ����Ѵ�.
		 * - �ߺ��Ǵ� ������ ���� �� ����ϸ� �ȵǸ�, �� ������ �������� �����ؼ� ����ؾ� �Ѵ�.
		 * - ������ ���� ������ �����ϴ� ������ ����ؾ� �Ѵ�.
		 */
		BufferedReader bf  = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine(), " ");

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		check = new boolean[n + 1];	// �ʱⰪ false


		bf.close();
	}
}