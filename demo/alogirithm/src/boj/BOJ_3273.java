package boj;

import java.io.*;
import java.util.*;

public class BOJ_3273 {
    static private int count(int N, int[] arr, int x) {
        int result =0;
        int sum =0;
        int lt = 0;
        int rt = N-1;

        Arrays.sort(arr);

        while (lt < rt) {
            sum = arr[lt] + arr[rt];
            if (sum == x) {
                result++;
            }
            if(sum < x) {
                lt++;
            } else {
                rt--;
            }
        }
        return result;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int  N = Integer.parseInt(br.readLine());
        int [] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int X = Integer.parseInt(br.readLine());
        int answer = count(N,arr,X);
        System.out.println(answer);
    }
}