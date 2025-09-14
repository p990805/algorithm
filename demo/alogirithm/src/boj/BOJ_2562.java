package boj;

import java.io.*;

public class BOJ_2562 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arrays = new int[9];
        int max = Integer.MIN_VALUE;
        int cnt = -1;
        for (int i = 0; i < arrays.length; i++) {
            arrays[i] = Integer.parseInt(br.readLine());
            if(arrays[i] > max) {
                max = arrays[i];
                cnt = i+1;
            }
        }
        System.out.println(max);
        System.out.println(cnt);

    }
}