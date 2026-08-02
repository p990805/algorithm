package codetree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class CodeTree_각_정점까지의_최단_경로_3 {

    static class Node implements Comparable<Node> {
        int vertex;
        int cost;

        public Node(int vertex, int cost){
            this.vertex = vertex;
            this.cost = cost;
        }

        @Override
        public int compareTo(Node o) {
            return this.cost - o.cost;
        }
    }

    static final int INF = Integer.MAX_VALUE;

    static int V,M;

    static int[] dist;

    static List<Node>[] graph;

    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringTokenizer st = new StringTokenizer(br.readLine());

       V = Integer.parseInt(st.nextToken());
       M = Integer.parseInt(st.nextToken());

       dist = new int[V + 1];
       graph = new ArrayList[V+1];

       int start = 1;

       for(int i=1; i<=V; i++) {
           graph[i] = new ArrayList<>();
       }
       for(int i=0; i<M; i++){
           st = new StringTokenizer(br.readLine());
           int from = Integer.parseInt(st.nextToken());
           int to = Integer.parseInt(st.nextToken());
           int cost = Integer.parseInt(st.nextToken());

           graph[from].add(new Node(to, cost));
       }

       Arrays.fill(dist, INF);
       dijkstra(start);

       for(int i=2; i<=V; i++) {
           if(dist[i] != INF) {
               System.out.println(dist[i]);
           }else {
               System.out.println(-1);
           }
       }

    }

    static private void dijkstra(int start) {
        PriorityQueue<Node> pq = new PriorityQueue<>();
        dist[start] = 0;
        pq.add(new Node(start,0));

        while(!pq.isEmpty()){
            Node current = pq.poll();

            int currentVertex = current.vertex;
            int currentCost = current.cost;

            if(currentCost > dist[currentVertex]){
                continue;
            }

            for(Node node: graph[currentVertex]){
                int nextVertex = node.vertex;
                int nextCost = node.cost + currentCost;

                if(dist[nextVertex] > nextCost){
                    dist[nextVertex] = nextCost;
                    pq.add(new Node(nextVertex,nextCost));
                }
            }
        }
    }
}
