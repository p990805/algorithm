import java.io.*;
import java.util.*;
import static java.lang.Integer.*;


public class CodeTree_Trail4_Chapter5_Lesson3_Practice1 {

    static int n;
    static int[]arr;
    static int[]dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = parseInt(br.readLine());
        arr = new int[n];
        dp = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = parseInt(st.nextToken());
        }

        dp[0] =1;

        for(int i =1; i<n;i++){
            for(int j =0; j<n;j++){
                if(arr[j] > arr[i] && (dp[j]==dp[i] || dp[j] > dp[i])){
                    dp[i] = dp[j]+1;
                }
            }
        }
        int ans = -1;
        for(int i =0; i<n;i++){
            if(dp[i] > ans){
                ans = dp[i];
            }
        }

        System.out.println(ans);

    }
}
