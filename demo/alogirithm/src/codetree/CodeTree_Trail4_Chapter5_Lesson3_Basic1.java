package codetree;

import java.io.*;
import java.util.*;
import static java.lang.Integer.*;


public class CodeTree_Trail4_Chapter5_Lesson3_Basic1 {
    static int n;
    static int [] arr;
    static int[]dp;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        arr = new int[n];
        dp = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = parseInt(st.nextToken());
        }
        dp[0] =1;
        for (int i = 1; i < n; i++) {
            int cnt =-1;
            for(int j =0; j<i;j++){
                if(dp[j] > cnt && arr[i] > arr[j]){
                    cnt = dp[j];
                }
            }
            dp[i] = cnt+1;
        }

        int ans= 1;
        for (int i = 0; i < n; i++) {
            if(dp[i] > ans){
                ans = dp[i];
            }
        }

        System.out.println(ans);
    }
}
