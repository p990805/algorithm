package boj;

import java.io.*;
import java.util.*;

public class BOJ_1932 {
    static int[][] arr, answer;
    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N][N];
        answer = new int[N][N];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int tmp = st.countTokens();
            for(int j =0; j< i+1; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        answer[0][0] = arr[0][0];
        for(int i =1; i<N; i++){
            answer[i][0] = arr[i][0]+ answer[i-1][0];
            answer[i][i] = arr[i][i] + answer[i-1][i-1];
        }
        for(int i =2; i< N;i++) {
            for(int j = 1; j<i;j++){
                answer[i][j] = Math.max(arr[i][j] + answer[i-1][j-1], arr[i][j] + answer[i-1][j]);
            }
        }
        int result = -1;
        for(int i = 0; i< N;i++){
            if(result < answer[N-1][i]){
                result = answer[N-1][i];
            }
        }
        System.out.println(result);
//        System.out.println(Arrays.deepToString(answer));

    }
}