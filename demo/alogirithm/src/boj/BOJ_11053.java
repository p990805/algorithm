package boj;

import java.io.*;
import java.util.*;

public class BOJ_11053 {
    static int N;
    static int[] arr,dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N];
        dp = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.fill(dp, 1);
        for(int i =1; i< N; i++) {
            for(int j =0; j<i;j++){
                if(arr[j] < arr[i]){
                    dp[i] = Math.max(dp[i], dp[j]+1);
                }
            }
        }

        int result = 0;
        for(int i : dp){
            if(result < i){
                result = i;
            }
        }
        System.out.println(result);
    }
}
