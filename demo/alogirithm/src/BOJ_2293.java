import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;

public class BOJ_2293 {
    static int n,k;
    static int[] arr,dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        arr = new int[n+1];
        dp = new int[k+1];

        dp[0] =1;

        for(int i =1; i<=n;i++){
            arr[i] = Integer.parseInt(br.readLine());
            for(int j =arr[i]; j<=k;j++){
                dp[j] += dp[j-arr[i]];
            }
        }
        System.out.println(dp[k]);
    }
}
