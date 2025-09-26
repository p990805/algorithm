package boj;

import java.io.*;
import java.util.*;

public class BOJ_9012 {

    static Deque<String> st;
    static StringBuilder sb = new StringBuilder();

    static String solution (String a) {
        for(int j =0; j< a.length();j++) {
            if(a.charAt(j)=='(') {
                st.addLast(String.valueOf(a.charAt(j)));
            } else {
                if(st.size() == 0) {
                    return "NO";
                } else {
                    st.pollLast();
                }
            }
        }
        if(st.size() == 0) {
            return "YES";
        } else {
            return "NO";
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int  N = Integer.parseInt(br.readLine());

        for(int i =0; i< N;i++) {
            st = new ArrayDeque<>();
            String a = br.readLine();
            String result = solution(a);
            sb.append(result).append("\n");
        }
        System.out.println(sb.toString().trim());
    }
}