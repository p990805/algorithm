package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class BOJ_11279 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> b-a);

        int n = Integer.parseInt(br.readLine());

        while( n-- > 0) {
            int num = Integer.parseInt(br.readLine());

            if(num ==0) {
                sb.append(pq.isEmpty() ? 0: pq.poll()).append("\n");
            } else {
                pq.add(num);
            }
        }
        System.out.println(sb.toString());
    }
}
