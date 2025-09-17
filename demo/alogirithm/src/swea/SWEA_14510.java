package swea;

import java.io.*;
import java.util.*;

public class SWEA_14510 {
    static int N;
    static int[] trees;
    static int target;
    static int oddNeed;
    static int evenNeed;
    static int days;

    static void solution() {
        // 홀수날과 짝수날 필요량 계산
        oddNeed = 0;
        evenNeed = 0;
        for (int i = 0; i < N; i++) {
            int diff = target - trees[i];
            evenNeed += diff / 2;
            oddNeed += diff % 2;
        }

        // 최소 날짜 찾기
        days = 0;
        while (true) {
            int odd = (days + 1) / 2;   // 홀수날 개수
            int even = days / 2;        // 짝수날 개수

            boolean enoughOdd = (odd >= oddNeed);
            boolean enoughEven = (even + (odd - oddNeed) / 2 >= evenNeed);

            if (enoughOdd && enoughEven) break;

            days++;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= T; tc++) {
            sb.append("#").append(tc).append(" ");
            N = Integer.parseInt(br.readLine());
            trees = new int[N];
            target = Integer.MIN_VALUE;
            days = 0;

            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) {
                trees[i] = Integer.parseInt(st.nextToken());
            }

            for (int i = 0; i < N; i++) {
                target = Math.max(target, trees[i]);
            }

            solution();
            sb.append(days).append("\n");
        }
        System.out.println(sb.toString().trim());
    }
}