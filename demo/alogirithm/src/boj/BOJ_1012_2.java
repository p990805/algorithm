package boj;

import java.io.*;
import java.util.*;

public class BOJ_1012_2 {
    static class Node {
        int x;
        int y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};
    static int[][] arr;
    static boolean[][] visitied;
    static int T;
    static int M,N,K;
    static Queue<Node> q;
    static int cnt;

    static boolean isValid(int nx, int ny) {
        return 0<=nx && nx<N && 0<=ny && ny<M;
    }

    static void bfs(){
        while (!q.isEmpty()) {
            Node cur = q.poll();
            int cx = cur.x;
            int cy = cur.y;

            for(int i=0;i<4;i++){
                int nx = cx+dx[i];
                int ny = cy+dy[i];
                if(isValid(nx,ny) && !visitied[nx][ny] && arr[nx][ny]==1) {
                    visitied[nx][ny] = true;
                    q.add(new Node(nx,ny));
                }
            }
        }
    }



    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        T = Integer.parseInt(br.readLine());

        for(int t =0; t<T;t++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            M = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());

            arr = new int[N][M];
            visitied = new boolean[N][M];
            cnt =0;
            for(int i =0; i< K;i++){
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                arr[y][x] = 1;
            }

            for(int i =0; i< N; i++){
                for(int j =0; j<M;j++) {
                    if(!visitied[i][j] && (arr[i][j]==1)) {
                        visitied[i][j] = true;
                        Node cur = new Node(i,j);
                        q = new LinkedList<>();
                        q.add(cur);
                        bfs();
                        cnt++;
                    } else {
                        continue;
                    }
                }
            }
            sb.append(cnt).append("\n");

        }
        System.out.println(sb.toString().trim());


    }
}