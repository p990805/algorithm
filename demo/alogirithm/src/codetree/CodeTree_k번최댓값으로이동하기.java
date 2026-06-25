package codetree;

import java.io.*;
import java.util.*;

public class CodeTree_k번최댓값으로이동하기 {
    static class Node {
        int x, y;
        Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    static int n, k;
    static int[][] grid;
    static int r, c;

    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    static boolean move(int x, int y) {
        boolean[][] visited = new boolean[n][n];
        Queue<Node> q = new LinkedList<>();

        int startValue = grid[x][y];

        int bestValue = -1;
        int bestRow = -1;
        int bestCol = -1;

        visited[x][y] = true;
        q.add(new Node(x, y));

        while (!q.isEmpty()) {
            Node cur = q.poll();

            for (int d = 0; d < 4; d++) {
                int nx = cur.x + dx[d];
                int ny = cur.y + dy[d];

                if (!valid(nx, ny)) continue;
                if (visited[nx][ny]) continue;

                if (grid[nx][ny] < startValue) {
                    visited[nx][ny] = true;
                    q.add(new Node(nx, ny));

                    int value = grid[nx][ny];

                    if (
                        value > bestValue ||
                            value == bestValue && nx < bestRow ||
                            value == bestValue && nx == bestRow && ny < bestCol
                    ) {
                        bestValue = value;
                        bestRow = nx;
                        bestCol = ny;
                    }
                }
            }
        }

        if (bestValue == -1) {
            return false;
        }

        r = bestRow;
        c = bestCol;
        return true;
    }

    static boolean valid(int x, int y) {
        return 0 <= x && x < n && 0 <= y && y < n;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        grid = new int[n][n];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                grid[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        st = new StringTokenizer(br.readLine());
        r = Integer.parseInt(st.nextToken()) - 1;
        c = Integer.parseInt(st.nextToken()) - 1;

        while (k-- > 0) {
            if (!move(r, c)) {
                break;
            }
        }

        System.out.println((r + 1) + " " + (c + 1));
    }
}