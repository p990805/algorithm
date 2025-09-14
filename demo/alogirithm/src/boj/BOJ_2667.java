package boj;

import java.io.*;
import java.util.*;
import static java.lang.Integer.*;

public class BOJ_2667 {
    static class Node {
        int x;
        int y;
        int z;

        public Node(int x, int y, int z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }
    }

    static int n;
    static int[][] arr;
    static boolean[][] visited;
    static int[][] tmp;
    static int cnt = 0;
    static ArrayList<Integer> answer = new ArrayList<>();
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static Queue<Node> q = new LinkedList<>();

    static void bfs() {
        while(!q.isEmpty()){
            Node cur = q.poll();
            int cx = cur.x;
            int cy = cur.y;

            for(int i = 0; i < 4; i++){
                int nx = cx + dx[i];
                int ny = cy + dy[i];
                if(valid(nx, ny) && !visited[nx][ny] && arr[nx][ny] == 1){
                    cnt++;
                    tmp[nx][ny] = cnt;
                    visited[nx][ny] = true;
                    q.add(new Node(nx, ny, cnt));
                }
            }
        }
        answer.add(cnt);
    }

    static boolean valid(int nx, int ny){
        return 0 <= nx && nx < n && 0 <= ny && ny < n;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = parseInt(br.readLine());
        arr = new int[n][n];
        tmp = new int[n][n];
        visited = new boolean[n][n];


        for (int i = 0; i < n; i++) {
            String a = br.readLine();
            for (int j = 0; j < n; j++) {
                arr[i][j] = parseInt(String.valueOf(a.charAt(j)));
            }
        }


        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if(arr[i][j] == 1 && !visited[i][j]){
                    visited[i][j] = true;
                    cnt = 1;
                    q.add(new Node(i, j, cnt));
                    bfs();
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append(answer.size()).append("\n");
        Collections.sort(answer);
        for (Integer num : answer) {
            sb.append(num).append("\n");
        }
        System.out.println(sb.toString().trim());
    }
}
