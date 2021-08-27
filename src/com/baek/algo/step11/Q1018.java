package com.baek.algo.step11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1018 {

	public static void main(String[] args) throws IOException {
		/*
		 * Q. 체스판은 검은색과 흰색이 번갈아서 칠해져 있어야 한다. 구체적으로, 각 칸이 검은색과 흰색 중 하나로 색칠되어 있고,
		 * 변을 공유하는 두 개의 사각형은 다른 색으로 칠해져 있어야 한다. 따라서 이 정의를 따르면 체스판을 색칠하는 경우는 두 가지뿐이다.
		 * 하나는 맨 왼쪽 위 칸이 흰색인 경우, 하나는 검은색인 경우이다.
		 * 보드가 체스판처럼 칠해져 있지 않을 때는 8*8 크기의 체스판으로 잘라낸 후에 몇 개의 정사각형을 다시 칠해야 한다.
		 * 이 때, 정사각형의 최소 개수를 구하는 프로그램을 작성하시오.
		 *
		 * 입력
		 * - 첫째 줄에 N과 M이 주어진다.
		 * - 둘째 줄부터 N개의 줄에는 보드의 각 행의 상태가 주어진다.
		 *
		 * 조건
		 * - N과 M은 8보다 크거나 같고, 50보다 작거나 같은 자연수이다.
		 * - B는 검은색이며, W는 흰색이다.
		 * - 첫째 줄에 지민이가 다시 칠해야 하는 정사각형 개수의 최솟값을 출력한다.
		 */
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st  = new StringTokenizer(bf.readLine(), " ");

		int m = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());




		bf.close();
	}
}