package boj;

import java.io.*;
import java.util.*;
import static java.lang.Integer.parseInt;

class Node {
    int x;
    int y;
    public Node(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class BOJ_10026 {
    static char[][] pricture;
    static boolean[][] normal_visited;
    static boolean[][] weak_visited;
    static int n;
    static int[] dx = {-1,1,0,0};
    static int[] dy ={0,0,-1,1};

    static int normalCount = 0;
    static int weakCount = 0;


    static boolean valid (int nx, int ny){
        return 0<=nx && nx < n && 0<=ny && ny <n;
    }

    static void normalBFS(int cx, int cy, char color){
        Queue<Node> q= new LinkedList<>();
        Node cur = new Node(cx,cy);
        q.add(cur);
        normal_visited[cx][cy] = true;
        while(!q.isEmpty()){
            Node current = q.poll();
            int currX = current.x;
            int currY = current.y;
            for(int i =0; i<4;i++){
                int nx = currX+dx[i];
                int ny = currY+dy[i];
                if(valid(nx,ny) && pricture[nx][ny]==color && !normal_visited[nx][ny]){
                    normal_visited[nx][ny] = true;
                    Node next = new Node(nx,ny);
                    q.add(next);
                }
            }

        }
    }

    static void weakBFS(int cx, int cy, char color) {
        Queue<Node> q = new LinkedList<>();
        Node cur = new Node(cx, cy);
        q.add(cur);
        weak_visited[cx][cy] = true;

        while (!q.isEmpty()) {
            Node current = q.poll();
            int currX = current.x;
            int currY = current.y;

            for (int i = 0; i < 4; i++) {
                int nx = currX + dx[i];
                int ny = currY + dy[i];

                if (valid(nx, ny) && !weak_visited[nx][ny]) {
                    if (color == 'R' || color == 'G') {
                        if (pricture[nx][ny] == 'R' || pricture[nx][ny] == 'G') {
                            weak_visited[nx][ny] = true;
                            q.add(new Node(nx, ny));
                        }
                    } else {
                        if (pricture[nx][ny] == 'B') {
                            weak_visited[nx][ny] = true;
                            q.add(new Node(nx, ny));
                        }
                    }
                }
            }
        }
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n= parseInt(br.readLine());
        pricture = new char[n][n];
        normal_visited = new boolean[n][n];
        weak_visited = new boolean[n][n];

        for(int i =0; i<n;i++){
            String line = br.readLine();
            for(int j =0; j<n;j++){
                pricture[i][j] = line.charAt(j);
            }
        }
        for(int i =0; i<n;i++){
            for(int j=0; j<n;j++){
                if(!normal_visited[i][j]){
                    normalBFS(i,j,pricture[i][j]);
                    normalCount++;
                }

                if(!weak_visited[i][j]){
                    weakBFS(i,j,pricture[i][j]);
                    weakCount++;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append(normalCount).append(" ").append(weakCount);
        System.out.println(sb.toString().trim());



    }
}
