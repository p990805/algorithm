package codetree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class CodeTree_마을구분하기 {
    static int[] dx ={-1,1,0,0};
    static int[] dy ={0,0,-1,1};
    static int n;
    static int[][]arr;
    static boolean[][]visited;
    static List<Integer> lst = new ArrayList<>();

    static int dfs(int x, int y) {

        visited[x][y] = true;
        int cnt =1;

        for(int i=0; i<4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(valid(nx,ny) && !visited[nx][ny] && arr[nx][ny] ==1) {
                cnt += dfs(nx,ny);
            }

        }
        return cnt;
    }

    static boolean valid(int x, int y) {
        return 0<=x && x<n && 0<=y && y<n;
    }

    static void print(){
        Collections.sort(lst);
        System.out.println(lst.size());
        for(int i=0; i<lst.size(); i++) {
            System.out.println(lst.get(i));
        }
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new int[n][n];
        visited = new boolean[n][n];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j]==1 && !visited[i][j]){
                    int village = dfs(i,j);
                    lst.add(village);
                }
            }
        }

        print();
    }

}
