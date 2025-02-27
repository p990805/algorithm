import java.io.*;
import java.util.*;
import static java.lang.Integer.*;


public class CodeTree_Trail4_Chapter3_Lesson1_Basic {

    static int n,m;

    static int[][] arr;
    static boolean[][] visited;

    static int[] dx = {0,1};
    static int[] dy = {1,0};

    static boolean valid(int nx, int ny){
        if(0<=nx && nx < n && 0<=ny && ny < m){
            return true;
        }
        else return false;
    }

    static void DFS(int si, int sj, int ei, int ej){
        if(si==ei && sj==ej){
            visited[si][sj] = true;
            return;
        }
        if(!visited[si][sj]){
            visited[si][sj] = true;
        }

        for(int i =0; i<2; i++){
            int nx = si+dx[i];
            int ny = sj+dy[i];
            if(valid(nx,ny) && !visited[nx][ny] && arr[nx][ny] != 0){
                DFS(nx,ny,ei,ej);
            }
        }


    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = parseInt(st.nextToken());
        m = parseInt(st.nextToken());

        arr = new int[n][m];
        visited = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                arr[i][j] = parseInt(st.nextToken());
            }
        }
        visited[0][0] = true;
        DFS(0, 0, n-1, m-1);

        if(!visited[n-1][m-1]){
            System.out.println(0);
        }else{
            System.out.println(1);
        }



    }
}