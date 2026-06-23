package codetree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class CodeTree_갈수있는곳들 {
    static class Node {
        int x;
        int y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    static int[]dx={-1,1,0,0};
    static int[]dy={0,0,-1,1};
    static int[][]grid;
    static boolean[][]visited;
    static int n,k;
    static int cnt = 0;

    static void bfs(int x, int y) {
        Queue<Node> q = new LinkedList<>();
        if (visited[x][y]) return;
        q.add(new Node(x, y));
        visited[x][y] = true;
        cnt++;

        while (!q.isEmpty()) {
            Node cur = q.poll();
            int cx = cur.x;
            int cy = cur.y;

            for (int i = 0; i < 4; i++) {
                int nx = cx + dx[i];
                int ny = cy + dy[i];
                if (valid(nx, ny) && grid[nx][ny] == 0 && !visited[nx][ny]) {
                    visited[nx][ny] = true;
                    cnt++;
                    q.add(new Node(nx, ny));
                }
            }
        }
    }

    static boolean valid(int nx, int ny) {
        return 0<=nx && nx<n && 0<=ny && ny<n;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        grid = new int[n][n];
        visited = new boolean[n][n];


        for(int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<n;j++){
                grid[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        while(k-- >0) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken())-1;
            int y = Integer.parseInt(st.nextToken())-1;

            bfs(x,y);
        }

        System.out.println(cnt);


    }

}
