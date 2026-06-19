package codetree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodeTree_계단오르기 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());

        int[] dp = new int[1001];
        dp[0] = 1;
        dp[1] = 0;
        dp[2] = 1;
        dp[3] = 1;
        if (n <= 3) {
            System.out.println(dp[n]);
            return;
        }
        for (int i = 4; i <= n; i++) {
            dp[i] = (dp[i-2] + dp[i-3]) % 10007;
        }
        System.out.println(dp[n]);
    }
}