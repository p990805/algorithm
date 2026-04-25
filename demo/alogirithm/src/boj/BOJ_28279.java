package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class BOJ_28279 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Deque<Integer> dq = new ArrayDeque<>();
        StringBuilder sb  = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        while(n-- > 0){

            String[] temp = br.readLine().split(" ");
            if(temp.length==2){
                if(temp[0].equals("1")){
                    dq.addFirst(Integer.parseInt(temp[1]));
                } else {
                    dq.addLast(Integer.parseInt(temp[1]));
                }
            }else {
                switch(temp[0]){
                    case "3": sb.append(dq.isEmpty()? -1: dq.pollFirst()).append("\n");break;
                    case "4" : sb.append(dq.isEmpty()? -1: dq.pollLast()).append("\n");break;
                    case "5" : sb.append(dq.size()).append("\n");break;
                    case "6" : sb.append(dq.isEmpty()? 1: 0).append("\n");break;
                    case "7": sb.append(dq.isEmpty()? -1: dq.peekFirst()).append("\n");break;
                    case"8": sb.append(dq.isEmpty()? -1: dq.peekLast()).append("\n");break;
                    default:
                }
            }
        }
        System.out.println(sb.toString().trim());

    }

}
