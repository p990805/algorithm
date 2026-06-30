package codetree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CodeTree_뿌요뿌요 {
    static int n;
    static int[][]arr;
    static boolean[][] visited;
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};

    static boolean valid(int nx, int ny) {
        return 0<=nx && nx<n && 0<=ny && ny<n;
    }

    static int dfs(int cx, int cy) {
        int cnt = 1;
        int curNum = arr[cx][cy];
        visited[cx][cy] = true;

        for(int d=0; d<4; d++) {
            int nx = cx+dx[d];
            int ny = cy+dy[d];
            if(valid(nx, ny) && !visited[nx][ny] && arr[nx][ny]==curNum) {
                cnt+=dfs(nx, ny);
            }
        }

        return cnt;
    }



    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        arr = new int[n][n];
        visited = new boolean[n][n];
        for (int i = 0; i < n; i++) {
            StringTokenizer st =  new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int bombedBlock =0;
        int maxBombedBlock = 0;

        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                if(!visited[i][j]) {
                    int cnt = dfs(i,j);
                    if(cnt >= 4) {
                        bombedBlock++;
                    }
                    maxBombedBlock = Math.max(maxBombedBlock, cnt);
                }
            }
        }

        System.out.println(bombedBlock+" "+maxBombedBlock);

    }

}
