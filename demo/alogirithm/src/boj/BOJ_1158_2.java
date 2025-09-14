package boj;

import java.io.*;
import java.util.*;

public class BOJ_1158_2 {
    static int N, K;

    static Queue<Integer> q = new LinkedList<>();

    static StringBuilder sb = new StringBuilder();

    static void remove(){
        int num =1;
        while (num != K) {
            int a = q.poll();
            q.add(a);
            num++;
        }
        int bye = q.poll();
        sb.append(bye).append(", ");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        sb.append("<");

        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        for(int i =1; i<=N;i++){
            q.add(i);
        }

        while(q.size() != 1) {
            remove();
        }
        sb.append(q.poll()).append(">");
        System.out.println(sb.toString().trim());

    }



}