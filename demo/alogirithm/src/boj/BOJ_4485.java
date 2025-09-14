package boj;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

class Node4485 {
    int x, y, cost;

    public Node4485(int x, int y, int cost) {
        this.x = x;
        this.y = y;
        this.cost = cost;
    }
}

public class BOJ_4485 {
    static int n;
    static int[][] map;
    static int[][] rupee;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    static boolean valid(int nx, int ny) {
        return 0 <= nx && nx < n && 0 <= ny && ny < n;
    }

    static void dijkstra() {
        PriorityQueue<Node4485> pq = new PriorityQueue<>((o1, o2) -> o1.cost - o2.cost);
        pq.offer(new Node4485(0, 0, map[0][0]));
        rupee[0][0] = map[0][0];

        while (!pq.isEmpty()) {
            Node4485 cur = pq.poll();
            int cx = cur.x;
            int cy = cur.y;
            int cost = cur.cost;

            if (rupee[cx][cy] < cost) continue;

            for (int i = 0; i < 4; i++) {
                int nx = cx + dx[i];
                int ny = cy + dy[i];

                if (valid(nx, ny)) {
                    int newCost = cost + map[nx][ny];
                    if (rupee[nx][ny] > newCost) {
                        rupee[nx][ny] = newCost;
                        pq.offer(new Node4485(nx, ny, newCost));
                    }
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = 1;

        while (true) {
            n = Integer.parseInt(br.readLine());
            if (n == 0) break;

            map = new int[n][n];
            rupee = new int[n][n];

            for (int i = 0; i < n; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                for (int j = 0; j < n; j++) {
                    map[i][j] = Integer.parseInt(st.nextToken());
                    rupee[i][j] = Integer.MAX_VALUE;
                }
            }

            dijkstra();
            System.out.println("Problem " + tc + ": " + rupee[n-1][n-1]);
            tc++;
        }
    }
}