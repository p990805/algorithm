package boj;

import java.io.*;
import java.util.*;
import static java.lang.Integer.*;

public class BOJ_2178 {

    static class Node{
        int x;
        int y;
        int z;
        public Node(int x, int y , int z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }
    }

    static int n,m;
    static int[][]arr;
    static int[] dx={-1,1,0,0};
    static int[] dy={0,0,-1,1};
    static boolean[][]visited;
    static Queue<Node> q = new LinkedList<>();
    static int answer=0;

    static boolean valid(int nx, int ny){
        return 0<=nx && nx< n && 0<=ny && ny<m;
    }
    static void bfs(){
        while(!q.isEmpty()){
            Node cur = q.poll();
            int cx = cur.x;
            int cy = cur.y;
            int cz = cur.z;
            if(cx== n-1 && cy== m-1){
                answer= cz;
                return;
            }

            for(int i=0;i<4;i++){
                int nx = cx+dx[i];
                int ny = cy+dy[i];
                if(valid(nx,ny) && !visited[nx][ny] && arr[nx][ny]==1){
                    visited[nx][ny] = true;
                    q.add(new Node(nx,ny,cz+1));

                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = parseInt(st.nextToken());
        m = parseInt(st.nextToken());

        arr= new int[n][m];
        visited = new boolean[n][m];

        for(int i =0; i<n;i++){
            char[]a = br.readLine().toCharArray();
            for(int j=0;j<m;j++){
                arr[i][j] = parseInt(String.valueOf(a[j]));
            }
        }

        Node start = new Node(0,0,1);
        q.add(start);
        visited[start.x][start.y] = true;

        bfs();

        System.out.println(answer);
    }

}
