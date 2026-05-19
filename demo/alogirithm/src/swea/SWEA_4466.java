package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class SWEA_4466 {
    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringBuilder sb = new StringBuilder();

       int T = Integer.parseInt(br.readLine());
       for(int tc=1; tc<=T; tc++){
           StringTokenizer st = new StringTokenizer(br.readLine());
           int n = Integer.parseInt(st.nextToken());
           int k = Integer.parseInt(st.nextToken());
           PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> b - a);

           int sum =0;
           st = new StringTokenizer(br.readLine());
           for(int i=0; i<n; i++){
               pq.add(Integer.parseInt(st.nextToken()));
           }

           for(int i=0; i<k; i++){
               sum += pq.poll();
           }

           sb.append("#").append(tc).append(" ").append(sum).append("\n");

       }
       System.out.println(sb.toString().trim());
    }

}
