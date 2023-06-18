package com.baek.algo.slidingWindow;

import java.io.*;
import java.util.*;

public class Q1 {

    public static int Solution(int n, int k, int[] arr) {
        int max = 0, sum = 0;

        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }

        max = sum;

        for (int i = k; i < n; i++) {
            sum = sum + arr[i] - arr[i - k];

            if (max < sum) max = sum;
        }

        return max;
    }

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split(" ");
        String[] line2 = br.readLine().split(" ");

        int n = Integer.parseInt(line[0]);
        int k = Integer.parseInt(line[1]);
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(line2[i]);
        }

        System.out.println(Solution(n, k, arr));
        br.close();
    }
}
