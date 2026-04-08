package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class BOJ_10866 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        Deque<Integer> dq = new ArrayDeque<>();

        int n = Integer.parseInt(br.readLine());

        while(n-- > 0){
            int num = 0;
            st = new StringTokenizer(br.readLine());
            String cmd = st.nextToken();
            if(st.hasMoreTokens()){
                num = Integer.parseInt(st.nextToken());
            }

            switch(cmd){
                case "push_front" : dq.addFirst(num); break;
                case "push_back" : dq.addLast(num); break;
                case "pop_front" :
                    if(dq.isEmpty()){
                        sb.append(-1).append("\n");break;
                    } else {
                        sb.append(dq.pollFirst()).append("\n");break;
                    }

                case "pop_back" :
                    if(dq.isEmpty()){
                        sb.append(-1).append("\n");break;
                    } else {
                        sb.append(dq.pollLast()).append("\n");break;
                    }

                case "size" : sb.append(dq.size()).append("\n");break;
                case "empty": sb.append(dq.isEmpty() ? 1: 0).append("\n");break;
                case "front":
                    if(dq.isEmpty()){
                        sb.append(-1).append("\n");break;
                    } else {
                        sb.append(dq.peekFirst()).append("\n");break;
                    }
                case "back":
                    if(dq.isEmpty()){
                        sb.append(-1).append("\n");break;
                    } else {
                        sb.append(dq.peekLast()).append("\n");break;
                    }
            }


        }
        System.out.println(sb.toString().trim());

    }

}
