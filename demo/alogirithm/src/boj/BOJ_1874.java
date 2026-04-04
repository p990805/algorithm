package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class BOJ_1874 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Deque<Integer> st = new ArrayDeque<>();

        int N = Integer.parseInt(br.readLine());
        int start = 0;

        while(N-->0){

            int value  = Integer.parseInt(br.readLine());

            if(value > start){
                for(int i = start +1; i<=value; i++){
                    st.push(i);
                    sb.append("+").append("\n");
                }
                start = value;
            } else if ( st.peek() != value){
                System.out.println("NO");
                return;
            }

            st.pop();
            sb.append("-").append("\n");

        }

        System.out.println(sb.toString().trim());

    }

}
