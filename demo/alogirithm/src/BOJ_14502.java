import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

import static java.lang.Integer.MIN_VALUE;
import static java.lang.Integer.parseInt;

public class BOJ_14502 {
    static int N,M;
    static int[][]arr;
    static int[][]copyArr;
    static int[] dx= {-1,1,0,0};
    static int[] dy= {0,0,-1,1};
    static class Node{
        int x;
        int y;
        public Node(int x,int y){
            this.x=x;
            this.y=y;
        }
    }
    static Queue<Node> q = new LinkedList<>();
    static int maxSafetyZone = MIN_VALUE;

    static void dfs(int WallCnt){
        if(WallCnt ==3){
            bfs();
            return;
        }
        for(int i =0; i<N;i++){
            for(int j =0; j<M;j++){
                if(arr[i][j] ==0){
                    arr[i][j] =1;
                    dfs(WallCnt+1);
                    arr[i][j] =0;
                }
            }
        }
    }

    static void bfs(){
        for(int i =0; i<N;i++){
            for(int j =0; j<M;j++){
                if(arr[i][j]==2){
                    q.add(new Node(i,j));
                }
            }
        }
        copyArr = new int[N][M];
        for(int i =0; i<N;i++){
            copyArr[i] = arr[i].clone();
        }
        while(!q.isEmpty()){
            Node cur = q.poll();
            for(int i =0; i<4;i++){
                int nx = cur.x+dx[i];
                int ny = cur.y+dy[i];
                if(valid(nx,ny) && copyArr[nx][ny]==0){
                    copyArr[nx][ny] =2;
                    q.add(new Node(nx,ny));
                }
            }
        }
        countSafetyZone();
    }
    static boolean valid(int nx, int ny){
        return 0<= nx && nx<N && 0<= ny && ny<M;
    }

    static void countSafetyZone(){
        int safetyZone = 0;
        for(int i =0; i<N;i++){
            for(int j =0; j<M;j++){
                if(copyArr[i][j]==0){
                    safetyZone++;
                }
            }
        }

        maxSafetyZone = Math.max(safetyZone, maxSafetyZone);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N= parseInt(st.nextToken());
        M= parseInt(st.nextToken());

        arr = new int[N][M];
        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<M;j++){
                arr[i][j] = parseInt(st.nextToken());
            }
        }

        dfs(0);
        System.out.println(maxSafetyZone);
    }
}
