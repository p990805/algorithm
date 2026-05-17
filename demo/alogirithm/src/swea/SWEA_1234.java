package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class SWEA_1234 {
    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringBuilder sb = new StringBuilder();

       int T =10;
       for(int tc =1; tc<=T; tc++){
           StringTokenizer st = new StringTokenizer(br.readLine());
           Deque<Character> stack = new ArrayDeque<>();
           sb.append("#").append(tc).append(" ");

           int n = Integer.parseInt(st.nextToken());
           String str  = st.nextToken();

           for(int i=0; i<n;i++){
               char ch = str.charAt(i);

               if(stack.isEmpty()){
                   stack.addLast(ch);
               } else if (stack.peekLast() == ch) {
                   stack.pollLast();
               } else stack.addLast(ch);
           }

           int size = stack.size();
           for(int i=0; i<size; i++){
               sb.append(stack.pollFirst());
           }
           sb.append("\n");

       }
       System.out.println(sb);
    }

}
