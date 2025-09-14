package boj;

import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


public class BOJ_13549 {
    static class Node{
        int node;
        int time;

        public Node(int node, int time) {
            this.node = node;
            this.time = time;
        }
    }
    static int N,K;
    static int max = 100000;
    static int min = Integer.MAX_VALUE;
    static boolean[] visited;
    static void bfs(){
        Queue<Node> q = new LinkedList<>();
        q.add(new Node(N,0));
        while(!q.isEmpty()){
            Node node = q.poll();
            visited[node.node] = true;
            if(node.node==K) min = Math.min(min, node.time);

            if(node.node*2 <= max && !visited[node.node*2]) q.add(new Node(node.node*2,node.time));
            if(node.node+1 <= max && !visited[node.node+1]) q.add(new Node(node.node+1,node.time+1));
            if(node.node-1 >=0 && !visited[node.node-1]) q.add(new Node(node.node-1,node.time+1));
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        visited = new boolean[max+1];

        bfs();
        System.out.println(min);
    }
}
