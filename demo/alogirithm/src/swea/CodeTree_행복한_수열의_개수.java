package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CodeTree_행복한_수열의_개수 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] grid = new int[n][n];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                grid[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        if (m == 1) {
            System.out.println(n * 2);
            return;
        }

        int answer = 0;

        for (int i = 0; i < n; i++) {
            int cnt = 1;
            for (int j = 1; j < n; j++) {
                if (grid[i][j] == grid[i][j - 1]) {
                    cnt++;
                    if (cnt == m) {
                        answer++;
                        break;
                    }
                } else {
                    cnt = 1;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            int cnt = 1;
            for (int j = 1; j < n; j++) {
                if (grid[j][i] == grid[j - 1][i]) {
                    cnt++;
                    if (cnt == m) {
                        answer++;
                        break;
                    }
                } else {
                    cnt = 1;
                }
            }
        }

        System.out.println(answer);
    }
}