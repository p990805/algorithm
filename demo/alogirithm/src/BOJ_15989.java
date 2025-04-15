import java.util.*;
import java.io.*;
import static java.lang.Integer.*;

public class BOJ_15989 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int[][]dp;

        int T = parseInt(st.nextToken());
        dp = new int[10001][4];
        for(int t = 0; t<T; t++)
        {
            int N = parseInt(br.readLine());
            dp[1][1] = dp[2][1] = dp[2][2] = dp[3][1] = dp[3][2] = dp[3][3] = 1;
            for(int i=4; i<=N; i++)
            {
                dp[i][1] = dp[i-1][1];
                dp[i][2] = dp[i-2][1] + dp[i-2][2];
                dp[i][3] = dp[i-3][1] + dp[i-3][2] + dp[i-3][3];
            }
            sb.append(dp[N][3]+dp[N][2]+dp[N][1]+"\n");
        }
        System.out.println(sb);

    }
}
