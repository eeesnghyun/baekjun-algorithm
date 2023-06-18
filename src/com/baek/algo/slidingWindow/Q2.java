package com.baek.algo.slidingWindow;

import java.io.*;
import java.util.*;

public class Q2 {

    public static void solution(int n, int[][] arr) {
        int[] max = {arr[0][0], arr[0][1], arr[0][2]};
        int[] min = {arr[0][0], arr[0][1], arr[0][2]};

        for (int i = 1; i < n; i++) {
            int max0 = Math.max(arr[i][0] + max[0], arr[i][0] + max[1]);
            int max1 = Math.max(Math.max(arr[i][1] + max[0], arr[i][1] + max[1]), arr[i][1] + max[2]);
            int max2 = Math.max(arr[i][2] + max[1], arr[i][2] + max[2]);
            max[0] = max0;
            max[1] = max1;
            max[2] = max2;

            int min0 = Math.min(arr[i][0] + min[0], arr[i][0] + min[1]);
            int min1 = Math.min(Math.min(arr[i][1] + min[0], arr[i][1] + min[1]), arr[i][1] + min[2]);
            int min2 = Math.min(arr[i][2] + min[1], arr[i][2] + min[2]);
            min[0] = min0;
            min[1] = min1;
            min[2] = min2;
        }

        System.out.println(Math.max(Math.max(max[0], max[1]), max[2]) + " " + Math.min(Math.min(min[0], min[1]), min[2]));
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] line = br.readLine().split(" ");
        int n = Integer.parseInt(line[0]);
        int[][] arr = new int[n][3];

        for (int i = 0; i < n; i++) {
            String[] line2 = br.readLine().split(" ");

            for (int j = 0; j < 3; j++) {
                arr[i][j] = Integer.parseInt(line2[j]);
            }
        }

        solution(n, arr);
        br.close();
    }
}

