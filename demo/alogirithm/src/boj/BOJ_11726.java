package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_11726 {
    static int N=0;
    public static void main(String args[])throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        int[] dp = new int[N+3];

        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 3;
        if(N > 3) {
            for (int j = 4; j <=N;j++){
                dp[j] = (dp[j-1] + dp[j-2]) % 10007;
            }
        }

        System.out.println(dp[N]);

    }
}