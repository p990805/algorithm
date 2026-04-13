package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class BOJ_18258 {
    static boolean isDigit(String str) {
        return Character.isDigit(str.charAt(str.length() - 1));
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Deque<Integer> q = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        while(n-- > 0){
            String str = br.readLine();
            if(isDigit(str)){
                int number = Integer.parseInt(str.split(" ")[1]);
                q.addLast(number);
            } else {
                switch(str) {
                    case "pop" : sb.append(q.isEmpty()? -1: q.pollFirst()).append("\n"); break;
                    case "size" : sb.append(q.size()).append("\n");break;
                    case "empty": sb.append(q.isEmpty()? 1:0).append("\n");break;
                    case "front": sb.append(q.isEmpty()? -1: q.peekFirst()).append("\n");break;
                    case "back": sb.append(q.isEmpty()? -1: q.peekLast()).append("\n");break;
                }
            }
        }
        System.out.println(sb.toString().trim());
    }

}