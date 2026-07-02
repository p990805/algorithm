package codetree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class CodeTree_나이트 {
    static class Node {
        int x,y,cnt;
        public Node(int x, int y,int cnt) {
            this.x = x;
            this.y = y;
            this.cnt = cnt;
        }
    }
    static int n;
    static int[][]arr;
    static boolean[][] visited;
    static int startX,startY,endX,endY;
    static Queue<Node> q = new LinkedList<>();
    static int[]dx = {-2,-1,1,2,2,1,-1,-2};
    static int[]dy = {-1,-2,-2,-1,1,2,2,1};
    static int result = -1;

    static boolean valid(int nx, int ny) {
        return 0<=nx && nx<n && 0<=ny && ny<n;
    }

    static void bfs(){
        while(!q.isEmpty()){
            Node cur = q.poll();
            if(cur.x == endX && cur.y == endY){
                result = cur.cnt;
                return;
            }
            for(int d=0; d<8; d++){
                int nx = cur.x+dx[d];
                int ny = cur.y+dy[d];
                if(valid(nx,ny) && !visited[nx][ny]){
                    visited[nx][ny] = true;
                    q.add(new Node(nx,ny,cur.cnt+1));
                }
            }
        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        arr = new int[n][n];
        visited = new boolean[n][n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        startX = Integer.parseInt(st.nextToken());
        startY = Integer.parseInt(st.nextToken());
        endX = Integer.parseInt(st.nextToken());
        endY = Integer.parseInt(st.nextToken());

        q.add(new Node(startX, startY,0));
        visited[startX][startY] = true;
        bfs();
        System.out.println(result);

    }

}
