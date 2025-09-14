package boj;

import java.io.*;
import java.util.*;
import static java.lang.Integer.*;

public class BOJ_2606 {
    static int n;
    static int k;
    static int[][] arr;
    static boolean[]visited;

    static Queue<Integer> q = new LinkedList<>();

    static void bfs(){
        while(!q.isEmpty()){
            int a = q.poll();
            //System.out.println("a의 값 : "+a);
            for(int i=1; i<=n;i++){
                if(arr[a][i] ==1 && !visited[i]){
                    visited[i] = true;
                    q.add(i);
                    //System.out.println("q에 넣는 값: "+i);
                }
            }

        }
    }

    static int print(){
        int a =0;
        for(int i =2; i<=n;i++){
            if(visited[i]){
                //System.out.println("i의 값: "+i+" a의 값: "+a);
                a++;
            }
        }
        return a;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = parseInt(br.readLine());
        k = parseInt(br.readLine());
        arr = new int[n+1][n+1];
        visited = new boolean[n+1];

        for(int i =0; i<k;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = parseInt(st.nextToken());
            int b = parseInt(st.nextToken());
            arr[a][b] = 1;
            arr[b][a] = 1;
        }

        q.add(1);
        visited[1] = true;
        bfs();
        int answer = print();
        System.out.println(answer);
    }
}
