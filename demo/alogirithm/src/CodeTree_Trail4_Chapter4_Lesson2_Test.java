import java.io.*;
import java.util.*;
import static java.lang.Integer.*;

public class CodeTree_Trail4_Chapter4_Lesson2_Test {

    private static class Pair {
        int x,y,z;
        public Pair(int x, int y, int z) {
            this.x=x;
            this.y=y;
            this.z=z;
        }
    }

    static int n,k;
    static int[][] arr;
    static boolean[][] visited;
    static int[][] answer;
    static int[] dx= {-1,1,0,0};
    static int[] dy= {0,0,-1,1};

    static Queue<Pair> q = new LinkedList<>();

    static boolean valid(int nx, int ny){
        return 0<= nx && nx <n && 0<=ny && ny <n;
    }

    static void bfs(){
        while(!q.isEmpty()){
            Pair curr = q.poll();
            int cx = curr.x;
            int cy = curr.y;
            int cnt = curr.z;
            answer[cx][cy]=cnt;

            for(int i =0; i<4; i++){
                int nx = cx+dx[i];
                int ny = cy+dy[i];
                if(valid(nx,ny) && !visited[nx][ny] && arr[nx][ny]==1){
                    visited[nx][ny] = true;
                    int nextNum = cnt+1;
                    Pair next = new Pair(nx,ny,nextNum);
                    q.add(next);
                }
            }
        }
    }

    static void changeArr(){
        for(int i =0; i<n ;i++){
            for(int j =0; j<n;j++){
                if(arr[i][j]==0 && !visited[i][j]){
                    answer[i][j] = -1;
                }
                else if(arr[i][j] == 1 && !visited[i][j]){
                    answer[i][j] = -2;
                }
            }
        }
    }

    static void printAnswer(){
        StringBuilder sb = new StringBuilder();
        for(int i =0; i<n; i++){
            for(int j=0; j<n; j++){
                sb.append(answer[i][j]).append(" ");
            }
            sb.append("\n");
        }
        System.out.println(sb.toString().trim());
    }



    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = parseInt(st.nextToken());
        k = parseInt(st.nextToken());

        arr = new int[n][n];
        visited = new boolean[n][n];
        answer = new int[n][n];

        for(int i =0; i<n;i++){
            st = new StringTokenizer(br.readLine());
            for(int j =0; j<n;j++){
                arr[i][j] = parseInt(st.nextToken());
                if(arr[i][j]==2){
                    visited[i][j] = true;
                    q.add(new Pair(i,j,0));
                }
            }
        }

        bfs();
        changeArr();
        printAnswer();


    }
}
