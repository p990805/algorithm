package boj;

import java.io.*;
import java.util.*;
import static java.lang.Integer.*;

public class BOJ_14890 {
    static int n, l;
    static int[][] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = parseInt(st.nextToken());
        l = parseInt(st.nextToken());
        arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                arr[i][j] = parseInt(st.nextToken());
            }
        }

        int answer = 0;
        for (int i = 0; i < n; i++) {
            answer += checkRow(i);
            answer += checkCol(i);
        }
        System.out.println(answer);
    }

    static int checkRow(int r) {
        boolean[] used = new boolean[n];
        for (int i = 0; i < n - 1; i++) {
            if (arr[r][i] == arr[r][i + 1])
                continue;
            int diff = arr[r][i + 1] - arr[r][i];
            if (diff == 1) {
                if (i - l + 1 < 0)
                    return 0;
                for (int j = i - l + 1; j <= i; j++) {
                    if (arr[r][j] != arr[r][i] || used[j])
                        return 0;
                }
                for (int j = i - l + 1; j <= i; j++) {
                    used[j] = true;
                }
            } else if (diff == -1) {
                if (i + l >= n)
                    return 0;
                for (int j = i + 1; j <= i + l; j++) {
                    if (arr[r][j] != arr[r][i + 1] || used[j])
                        return 0;
                }
                for (int j = i + 1; j <= i + l; j++) {
                    used[j] = true;
                }
            } else {
                return 0;
            }
        }
        return 1;
    }

    static int checkCol(int c) {
        boolean[] used = new boolean[n];
        for (int i = 0; i < n - 1; i++) {
            if (arr[i][c] == arr[i + 1][c])
                continue;
            int diff = arr[i + 1][c] - arr[i][c];
            if (diff == 1) {
                if (i - l + 1 < 0)
                    return 0;
                for (int j = i - l + 1; j <= i; j++) {
                    if (arr[j][c] != arr[i][c] || used[j])
                        return 0;
                }
                for (int j = i - l + 1; j <= i; j++) {
                    used[j] = true;
                }
            } else if (diff == -1) {
                if (i + l >= n)
                    return 0;
                for (int j = i + 1; j <= i + l; j++) {
                    if (arr[j][c] != arr[i + 1][c] || used[j])
                        return 0;
                }
                for (int j = i + 1; j <= i + l; j++) {
                    used[j] = true;
                }
            } else {
                return 0;
            }
        }
        return 1;
    }
}
