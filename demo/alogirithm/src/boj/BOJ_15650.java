package boj;

import java.io.*;
import java.util.*;

public class BOJ_15650 {
    static int N,M;
    static int[] arr;
    static StringBuilder sb  = new StringBuilder();

    static void dfs(int index, int depth) {
        if(depth == M) {
            for(int i : arr) {
                sb.append(i).append(" ");
            }
            sb.append("\n");
            return;
        }

        for(int i =index; i<=N;i++) {
            arr[depth] = i;
            dfs(i+1, depth+1);
        }

    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[M];
        dfs(1,0);
        System.out.println(sb.toString().trim());
    }
}