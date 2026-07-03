package codetree;

import java.io.*;
import java.util.*;

public class CodeTree_비를피하기 {
    static class Node {
        int x, y, cnt;

        Node(int x, int y, int cnt) {
            this.x = x;
            this.y = y;
            this.cnt = cnt;
        }
    }

    static int n, h, m;
    static int[][] map;
    static int[][] answer;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    static boolean valid(int x, int y) {
        return 0 <= x && x < n && 0 <= y && y < n;
    }

    static int bfs(Node start) {
        Queue<Node> q = new LinkedList<>();
        boolean[][] visited = new boolean[n][n];

        q.add(start);
        visited[start.x][start.y] = true;

        while (!q.isEmpty()) {
            Node cur = q.poll();

            if (map[cur.x][cur.y] == 3) {
                return cur.cnt;
            }

            for (int d = 0; d < 4; d++) {
                int nx = cur.x + dx[d];
                int ny = cur.y + dy[d];

                if (valid(nx, ny) && !visited[nx][ny] && map[nx][ny] != 1) {
                    visited[nx][ny] = true;
                    q.add(new Node(nx, ny, cur.cnt + 1));
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        h = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        map = new int[n][n];
        answer = new int[n][n];

        List<Node> people = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < n; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());

                if (map[i][j] == 2) {
                    people.add(new Node(i, j, 0));
                }
            }
        }

        for (Node person : people) {
            answer[person.x][person.y] = bfs(person);
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sb.append(answer[i][j]).append(" ");
            }
            sb.append("\n");
        }

        System.out.print(sb);
    }
}