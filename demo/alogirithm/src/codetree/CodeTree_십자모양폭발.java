package codetree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CodeTree_십자모양폭발 {
    static StringBuilder sb = new StringBuilder();
    static int[][] grid;
    static int n,r,c;
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};

    static boolean valid(int nx, int ny) {
        return 0<=nx && nx<n && 0<=ny && ny<n;
    }

    static void bomb(int cx, int cy){
        int cnt = grid[cx][cy]-1;
        if(cnt == 0) {
            grid[cx][cy] = 0;
            clear();
            return;
        }else {
            grid[cx][cy] = 0;
            for(int i=0;i<4;i++){
                for(int j=1; j<=cnt;j++){
                    int nx = cx+(dx[i]*j);
                    int ny = cy+(dy[i]*j);
                    if(valid(nx,ny)){
                        grid[nx][ny] = 0;
                    }
                }
            }
            clear();
        }
    }

    static void clear(){
        int[][] tmp = new int[n][n];

        for(int i=0;i<n;i++){
            int cnt = n-1;
            for(int j =n-1; j>=0;j--){
                if(grid[j][i]!=0){
                    tmp[cnt--][i] = grid[j][i];
                }
            }
        }

        grid = tmp;
    }

    static void print(){
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                sb.append(grid[i][j]).append(" ");
            }
            sb.append("\n");
        }
        System.out.println(sb.toString().trim());
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        grid = new int[n][n];

        for(int i=0; i<n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0; j<n; j++) {
                grid[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        StringTokenizer st = new StringTokenizer(br.readLine());
        r = Integer.parseInt(st.nextToken())-1;
        c = Integer.parseInt(st.nextToken())-1;

        bomb(r,c);
        print();

    }

}
