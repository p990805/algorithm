package boj;

import java.io.*;
import java.util.*;

public class BOJ_2164 {
    static Queue<Integer> q = new LinkedList<>();

    static void shuffle () {
        if(q.size() <= 1){
            return;
        }
        q.poll();
        int last = q.poll();
        q.add(last);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for(int i = 1; i <= N; i++) {
            q.add(i);
        }

        for(int i =0; i< N; i++) {
            shuffle();
        }

        System.out.println(q.peek());

    }
}