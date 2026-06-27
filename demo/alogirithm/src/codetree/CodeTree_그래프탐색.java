package codetree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CodeTree_그래프탐색 {
    static int n,m;
    static int[][]arr;
    static boolean[] visited;
    static int cnt;

    static void dfs(int vertex) {
        if(visited[vertex]) return;
        visited[vertex] = true;

        for(int i=1;i<=n;i++) {
            if(arr[vertex][i] == 1 && !visited[i]) {
                cnt++;
                dfs(i);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[n+1][n+1];
        visited = new boolean[n+1];

        while(m-- > 0) {
            st = new StringTokenizer(br.readLine());
            int r = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            arr[r][c] = 1;
            arr[c][r] = 1;
        }

        dfs(1);

        System.out.println(cnt);
    }

}
