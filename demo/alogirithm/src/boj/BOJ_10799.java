package boj;

import java.util.*;
import java.io.*;

public class BOJ_10799 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        Deque<Integer> dq = new ArrayDeque<>();
        int answer = 0;

        for(int i = 0; i < str.length(); ++i){
            if(str.charAt(i) == '(') dq.add(i);
            else {
                if(dq.isEmpty()) continue;
                if(dq.getLast() + 1 == i) {
                    dq.removeLast();
                    answer += dq.size();
                }
                else {
                    answer += 1;
                    dq.removeLast();
                }
            }
        }
        System.out.println(answer);
    }
}