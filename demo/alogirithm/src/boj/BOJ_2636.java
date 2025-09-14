package boj;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.LinkedList;
import java.util.StringTokenizer;
import java.util.Queue;

import static java.lang.Integer.parseInt;

class Node2636 {
    int x;
    int y;
    public Node2636(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class BOJ_2636 {
    static int n, m;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int[][] cheese;
    static boolean[][] visited;
    static int cheeseCount = 0;
    static int time = 0;
    static Queue<Node2636> q = new LinkedList<>();

    static void bfs() {
        q.add(new Node2636(0, 0));
        visited[0][0] = true;

        while(!q.isEmpty()) {
            Node2636 curr = q.poll();
            int cx = curr.x;
            int cy = curr.y;

            for(int i = 0; i < 4; i++) {
                int nx = cx + dx[i];
                int ny = cy + dy[i];
                if(valid(nx, ny) && !visited[nx][ny]) {
                    visited[nx][ny] = true;
                    if(cheese[nx][ny] == 1) {
                        cheese[nx][ny] = 0;
                        cheeseCount--;
                    } else {
                        q.add(new Node2636(nx, ny));
                    }
                }
            }
        }
    }

    static boolean valid(int nx, int ny) {
        return 0 <= nx && nx < n && 0 <= ny && ny < m;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = parseInt(st.nextToken());
        m = parseInt(st.nextToken());
        cheese = new int[n][m];


        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < m; j++) {
                cheese[i][j] = parseInt(st.nextToken());
                if(cheese[i][j] == 1) {
                    cheeseCount++;
                }
            }
        }

        int lastCheeseCount = 0;


        while(cheeseCount > 0) {
            lastCheeseCount = cheeseCount;
            visited = new boolean[n][m];
            bfs();
            time++;
        }

        StringBuilder sb = new StringBuilder();
        sb.append(time).append("\n").append(lastCheeseCount);
        System.out.println(sb.toString());
    }
}