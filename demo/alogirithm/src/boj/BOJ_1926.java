package boj;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.LinkedList;
import java.util.StringTokenizer;
import java.util.Queue;

import static java.lang.Integer.parseInt;

class Node1926{
    int x;
    int y;
    public Node1926(int x, int y){
        this.x = x;
        this.y = y;
    }
}

public class BOJ_1926 {
    static int n, m;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int[][] picture;
    static boolean[][] visited;
    static int pictureCnt = 0;
    static int highestPictureLand = 0;
    static Queue<Node1926> q = new LinkedList<>();

    static void bfs(int startX, int startY){
        pictureCnt++;
        q.add(new Node1926(startX, startY));
        visited[startX][startY] = true;
        int size = 1;

        while(!q.isEmpty()){
            Node1926 curr = q.poll();
            int cx = curr.x;
            int cy = curr.y;

            for(int i=0; i<4; i++){
                int nx = cx + dx[i];
                int ny = cy + dy[i];
                if(valid(nx, ny) && picture[nx][ny] == 1 && !visited[nx][ny]){
                    q.add(new Node1926(nx, ny));
                    visited[nx][ny] = true;
                    size++;
                }
            }
        }

        if(size > highestPictureLand){
            highestPictureLand = size;
        }
    }

    static boolean valid(int nx, int ny){
        return 0<=nx && nx<n && 0<=ny && ny<m;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = parseInt(st.nextToken());
        m = parseInt(st.nextToken());
        picture = new int[n][m];
        visited = new boolean[n][m];

        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < m; j++){
                picture[i][j] = parseInt(st.nextToken());
            }
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(!visited[i][j] && picture[i][j] == 1){
                    bfs(i, j);
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append(pictureCnt).append("\n").append(highestPictureLand);
        System.out.println(sb.toString());
    }
}