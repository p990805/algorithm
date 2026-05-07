package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SWEA_7102 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= T; tc++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            int maxNum = n + m;
            int[] sums = new int[maxNum + 1];

            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= m; j++) {
                    sums[i + j]++;
                }
            }

            int maxCount = 0;
            for (int i = 2; i <= maxNum; i++) {
                if (sums[i] > maxCount) {
                    maxCount = sums[i];
                }
            }

            sb.append("#").append(tc);
            for (int i = 2; i <= maxNum; i++) {
                if (sums[i] == maxCount) {
                    sb.append(" ").append(i);
                }
            }
            sb.append("\n");
        }

        System.out.print(sb);
    }
}