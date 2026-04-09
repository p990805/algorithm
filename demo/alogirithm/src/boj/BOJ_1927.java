package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class BOJ_1927 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        PriorityQueue<Integer> h = new PriorityQueue<>();

        int n = Integer.parseInt(br.readLine());

        while( n-- > 0){
            int x = Integer.parseInt(br.readLine());
            if(x==0){
                if(h.isEmpty()){
                    sb.append(0).append("\n");
                } else {
                    sb.append(h.poll()).append("\n");
                }
            } else {
                h.add(x);
            }
        }

        System.out.println(sb.toString());

    }

}
