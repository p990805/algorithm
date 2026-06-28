package codetree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CodeTree_두방향탈출가능여부판별하기 {
    static int n,m;
    static int[][]arr;
    static boolean[][] visited;
    static int[] dx = {1,0};
    static int[] dy = {0,1};
    static int result = 0;
    static void dfs(int cx, int cy){

        if(cx==n-1 && cy==m-1){
            result = 1;
            return;
        }
        for(int i=0;i<2;i++){
            int nx = cx+dx[i];
            int ny = cy+dy[i];
            if(valid(nx,ny) && !visited[nx][ny] && arr[nx][ny]==1){
                visited[nx][ny] = true;
                dfs(nx,ny);
            }
        }
    }
    static boolean valid(int nx,int ny){
        return 0<=nx && nx<n && 0<=ny && ny<m;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[n][m];
        visited = new boolean[n][m];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        visited[0][0] = true;
        dfs(0,0);
        System.out.println(result);
    }

}
