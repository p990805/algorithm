package boj;

import java.io.*;
import java.util.*;

public class BOJ_1920 {
    static int N,M;
    static int[] A;
    static int[] arr;
    static boolean solution(int[] A, int findNum){
        int minIndex = 0;
        int maxIndex = A.length -1;

        while(minIndex <= maxIndex){
            int curIndex = (minIndex + maxIndex) / 2;
            if(A[curIndex] == findNum){
                return true;
            } else if(A[curIndex] < findNum){
                minIndex = curIndex + 1;
            } else{
                maxIndex = curIndex - 1;
            }
        }
        return false;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        N = Integer.parseInt(br.readLine());
        A = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(A);

        M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        arr = new int[M];
        for(int i=0; i<M; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            boolean result = solution(A, arr[i]);
            sb.append(result ? 1: 0 ).append("\n");
        }

        System.out.println(sb.toString().trim());
    }
}