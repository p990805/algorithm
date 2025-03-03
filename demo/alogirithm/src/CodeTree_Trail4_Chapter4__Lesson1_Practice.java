import java.io.*;
import java.util.*;
import static java.lang.Integer.*;

class Node{
    int x,y;
    public Node(int x, int y){
        this.x = x;
        this.y = y;
    }
}

public class CodeTree_Trail4_Chapter4__Lesson1_Practice {
    static int n,k;
    static int[][] arr;
    static boolean[][] visited;
    static int[] dx={-1,1,0,0};
    static int[] dy={0,0,-1,1};
    static int cnt=0;

    static Queue<Node> q = new LinkedList<>();

    static boolean valid(int nx, int ny){
        return 0<= nx && nx <n && 0<= ny && ny <n;
    }

    static void bfs(){
        while(!q.isEmpty()){
            Node curr = q.poll();
            int cx = curr.x;
            int cy = curr.y;
            cnt++;

            for(int i =0; i<4 ;i++){
                int nx = cx+dx[i];
                int ny = cy+dy[i];
                if(valid(nx,ny) && !visited[nx][ny] && arr[nx][ny] == 0){
                    visited[nx][ny] = true;
                    q.add(new Node(nx,ny));
                }
            }
        }
    }

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = parseInt(st.nextToken());
        k = parseInt(st.nextToken());

        arr = new int[n][n];
        visited = new boolean[n][n];

        for(int i =0; i<n;i++){
            st = new StringTokenizer(br.readLine());
            for(int j =0; j<n;j++){
                arr[i][j] = parseInt(st.nextToken());
            }
        }

        for(int i =0; i<k; i++){
            st = new StringTokenizer(br.readLine());
            int x = parseInt(st.nextToken())-1;
            int y = parseInt(st.nextToken())-1;
            visited[x][y] = true;
            q.add(new Node(x,y));
        }

        bfs();
        System.out.println(cnt);
    }
}