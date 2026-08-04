package codetree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class CodeTree_가장_오래_걸리는_학생2 {
    static class Node implements Comparable<Node>{
        int vertex;
        int cost;

        public Node(int vertex,int cost) {
            this.vertex = vertex;
            this.cost = cost;
        }
        @Override
        public int compareTo(Node o) {
            return this.cost - o.cost;
        }
    }
    static final int inf = Integer.MAX_VALUE;
    static int n,m;
    static List<Node>[] graph;
    static int[]dist;

    static void dijkstra(int start) {
        PriorityQueue<Node> pq = new PriorityQueue<>();
        dist[start] = 0;
        pq.add(new Node(start,0));

        while(!pq.isEmpty()){
            Node current = pq.poll();
            int currentVertex = current.vertex;
            int currentCost = current.cost;

            if(dist[currentVertex] < current.cost){
                continue;
            }

            for(Node next : graph[currentVertex]){
                int nextVertex = next.vertex;
                int nextCost = next.cost + currentCost;

                if(dist[nextVertex] > nextCost){
                    dist[nextVertex] = nextCost;
                    pq.add(new Node(nextVertex,nextCost));
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringTokenizer st = new StringTokenizer(br.readLine());

       n = Integer.parseInt(st.nextToken());
       m = Integer.parseInt(st.nextToken());

       graph = new List[n+1];
       dist = new int[n+1];
       Arrays.fill(dist,inf);
       for (int i = 1; i <= n; i++) {
           graph[i] = new ArrayList<>();
       }

       while(m-- > 0) {
           st = new StringTokenizer(br.readLine());

           int from = Integer.parseInt(st.nextToken());
           int to = Integer.parseInt(st.nextToken());
           int cost = Integer.parseInt(st.nextToken());

//           graph[from].add(new Node(to, cost));
           graph[to].add(new Node(from, cost));
       }

       int start = n;
       dijkstra(start);

       int max = -1;
       for(int i =1; i<=n; i++){
           max = Math.max(max,dist[i]);
       }
        System.out.println(max);
    }

}
