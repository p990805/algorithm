package boj;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.*;


public class BOJ_15649 {
    static int N,M;
    static int[] arr;
    static boolean[] checked;

    static void backTracking(int depth){
        if(depth ==M){
            for (int i =0; i< M;i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            return;
        }
        for(int i =1; i<=N;i++){
            if(!checked[i]){
                checked[i] = true;
                arr[depth] = i;
                backTracking(depth+1);
                checked[i] = false;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[M];
        checked = new boolean[N + 1];
        backTracking(0);

    }
}
