package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class BOJ_4949 {
    static boolean check(String str) {
        Deque<Character> stack = new ArrayDeque<>();

        int len = str.length();
        for(int i = 0; i < len; i++) {
            char c = str.charAt(i);
            if(c=='(' || c=='[') {
                stack.addLast(c);
            } else if(c==')') {
                char ch = stack.isEmpty() ? 'N' : stack.peekLast();
                if(ch == '(') {
                   stack.pollLast();
                } else {
                    return false;
                }
            } else if (c== ']') {
                char ch = stack.isEmpty() ? 'N' : stack.peekLast();
                if(ch == '[') {
                    stack.pollLast();
                } else {
                    return false;
                }
            }
        }

       return stack.isEmpty();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while(true) {
            String str = br.readLine();
            if (str.equals(".")) {
                break;
            }
            boolean flag = check(str);

            if(flag){
                sb.append("yes").append("\n");
            } else {
                sb.append("no").append("\n");
            }
        }
        System.out.println(sb.toString().trim());
    }

}
