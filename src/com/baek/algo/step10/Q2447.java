package com.baek.algo.step10;

public class Q2447 {

	public static void main(String[] args) {
		int n = 3;

		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n; j++) {
				if(i % 2 == 0 && j % 2 == 0) {
					System.out.print(" ");
				} else {
					if(j % n == 0) {
						System.out.println("*");
					} else {
						System.out.print("*");
					}
				}
			}
		}
	}
}