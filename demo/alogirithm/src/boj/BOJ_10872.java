package boj;

import java.io.*;

public class BOJ_10872 {
    static int N, answer;
    static void factorial(int n) {
        if(n == 0){
            return;
        }
        answer *= n;
        factorial(n-1);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        answer =1;
        factorial(N);
        System.out.println(answer);
    }
}