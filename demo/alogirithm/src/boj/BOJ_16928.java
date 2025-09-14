package boj;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_16928 {
    static int n,m;
    static int [] arr;
    static boolean [] visited;

    static void bfs(int start){
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{start,0});
        visited[start] = true;

        while(!q.isEmpty()){
            int [] cur = q.poll();
            if( cur[0] ==100){
                System.out.println(cur[1]);
                return;
            }

            for(int i =1; i<=6;i++){
                int next = cur[0]+i;
                if(next <= 100){
                    if(arr[next] !=0){
                        next = arr[next];
                    }
                    if(!visited[next]){
                        visited[next] = true;
                        q.add(new int[]{next,cur[1]+1});
                    }
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[101];
        visited = new boolean[101];

        for(int i =0; i< n+m;i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            arr[x]=y;
        }
        bfs(1);
    }
}
