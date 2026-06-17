package codetree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CodeTree_K개중N개선택 {
    static int K, N;
    static int[] arr;
    static StringBuilder sb = new StringBuilder();

    static void bt(int depth) {
        if (depth == N) {
            for (int i = 0; i < N; i++) {
                sb.append(arr[i]);
                if (i < N - 1) sb.append(' ');
            }
            sb.append('\n');
            return;
        }
        for (int i = 1; i <= K; i++) {
            arr[depth] = i;
            bt(depth + 1);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        K = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());

        arr = new int[N];
        bt(0);
        System.out.print(sb);
    }
}