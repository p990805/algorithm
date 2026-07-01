package codetree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class CodeTree_최소경로로탈출하기 {
    static class Node {
        int x,y,z;
        public Node(int x, int y, int z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }
    }
    static Queue<Node> q = new LinkedList<>();
    static int n,m;
    static int[][]arr;
    static boolean[][] visited;
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};
    static int answer = -1;

    static boolean valid(int nx, int ny){
        return 0<= nx && nx<n && 0<= ny && ny<m;
    }

    static void bfs() {
        while(!q.isEmpty()) {
            Node cur = q.poll();
            int cx = cur.x;
            int cy = cur.y;
            int cnt = cur.z;

            if(cx==n-1 && cy==m-1){
                answer = cnt;
                return;
            }

            for(int d=0; d<4; d++) {
                int nx = cx + dx[d];
                int ny = cy + dy[d];
                if(valid(nx,ny) && !visited[nx][ny] && arr[nx][ny] ==1) {
                    visited[nx][ny] = true;
                    q.add(new Node(nx,ny,cnt+1));
                }
            }
        }


    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int[n][m];
        visited = new boolean[n][m];

        for(int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<m; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        Node start = new Node(0, 0,0);
        visited[0][0] = true;
        q.add(start);
        bfs();
        System.out.println(answer);
    }

}
