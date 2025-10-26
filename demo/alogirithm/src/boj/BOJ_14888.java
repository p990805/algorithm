package boj;

import java.io.*;
import java.util.*;

public class BOJ_14888 {
    static int MAX = Integer.MIN_VALUE;
    static int MIN = Integer.MAX_VALUE;
    static int N;
    static int[] arr;
    static int[] op = new int[4]; // 연산자 배열
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());

        arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 4; i++) {
            op[i] = Integer.parseInt(st.nextToken());
        }

        backTracking(arr[0], 1);

        System.out.println(MAX);
        System.out.println(MIN);
    }

    public static void backTracking(int num, int idx) {

        if (idx == N) {
            MAX = Math.max(MAX, num);
            MIN = Math.min(MIN, num);
            return;
        }

        for (int i = 0; i < 4; i++) {
            if (op[i] > 0) {
                op[i]--;
                switch (i) {
                    case 0:	backTracking(num + arr[idx], idx + 1);	break;
                    case 1:	backTracking(num - arr[idx], idx + 1);	break;
                    case 2:	backTracking(num * arr[idx], idx + 1);	break;
                    case 3:	backTracking(num / arr[idx], idx + 1);	break;
                }
                op[i]++;
            }
        }
    }
}