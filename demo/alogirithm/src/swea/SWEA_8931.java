package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class SWEA_8931 {
    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringBuilder sb = new StringBuilder();

       int T = Integer.parseInt(br.readLine());
       for(int tc=1; tc<=T; tc++){
           int  k = Integer.parseInt(br.readLine());
           Deque<Integer> dq = new ArrayDeque<>();

           while(k -- > 0) {
               int n = Integer.parseInt(br.readLine());

               if(n != 0) {
                   dq.addLast(n);
               } else {
                   dq.pollLast();
               }
           }

           int answer =0;
           int size = dq.size();
           for(int i=0; i<size; i++) {
               answer += dq.pollFirst();
           }


           sb.append("#").append(tc).append(" ").append(answer).append("\n");
       }
       System.out.println(sb.toString().trim());
    }

}
