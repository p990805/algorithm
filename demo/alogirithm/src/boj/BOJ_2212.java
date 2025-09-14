package boj;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

public class BOJ_2212 {
    static int n,k;
    static int[] arr;
    static Integer[] arr2;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = parseInt(br.readLine());
        k = parseInt(br.readLine());
        if(k >= n){
            System.out.println(0);
            return;
        }

        int sum =0;
        arr = new int[n];
        arr2 = new Integer[n-1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        for(int i = 0; i < n-1; i++){
            arr2[i] = arr[i+1] - arr[i];
        }

        Arrays.sort(arr2, Collections.reverseOrder());
        for(int i = k-1; i <n-1;i++){
            sum += arr2[i];
        }
        System.out.println(sum);
    }
}
