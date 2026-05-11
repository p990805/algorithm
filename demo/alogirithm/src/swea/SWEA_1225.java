package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class SWEA_1225 {
    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringBuilder sb  = new StringBuilder();

       int T =10;
       for(int tc=1; tc<=T; tc++){
           int n = Integer.parseInt(br.readLine());
           Deque<Integer> dq = new ArrayDeque<>();
           StringTokenizer st = new StringTokenizer(br.readLine());
           for(int i=0; i<8; i++){
               dq.addLast(Integer.parseInt(st.nextToken()));
           }

           boolean flag = true;
           int cycleNum = 1;

           while (flag) {
               int num = dq.pollFirst();
               int minusPassword = num - cycleNum;
               if(minusPassword <=0){
                   minusPassword = 0;
                   flag = false;
               }
               dq.addLast(minusPassword);
               cycleNum++;
               if(cycleNum > 5){
                   cycleNum = 1;
               }
           }

           sb.append("#").append(n).append(" ");
           for(int i =0; i<7; i++){
               sb.append(dq.pollFirst()).append(" ");
           }
           sb.append(dq.pollFirst()).append("\n");
       }
       System.out.println(sb);
    }

}
