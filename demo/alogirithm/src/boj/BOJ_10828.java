package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class BOJ_10828 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int capacity = Integer.parseInt(br.readLine());
        Stack<Integer> stk = new Stack<>();
        StringBuilder sb = new StringBuilder();

        int i = 0;
        while (i < capacity) {
            st = new StringTokenizer(br.readLine());
            switch (st.nextToken()) {
                case "push":
                    stk.push(Integer.parseInt(st.nextToken()));
                    break;
                case "pop":
                    if(stk.isEmpty()) {
                        sb.append(-1).append("\n");
                        break;
                    }
                    sb.append(stk.pop()).append("\n");
                    break;
                case "size":
                    sb.append(stk.size()).append("\n");
                    break;
                case "empty":
                    sb.append(stk.isEmpty() ? 1 : 0).append("\n");
                    break;
                case "top":
                    if(!stk.isEmpty()) {
                        sb.append(stk.peek()).append("\n");
                        break;
                    }
                    sb.append(-1).append("\n");
                    break;
            }
            i++;
        }
        System.out.println(sb.toString().trim());
    }
}