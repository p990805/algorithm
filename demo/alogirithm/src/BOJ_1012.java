import java.io.*;
import java.util.*;
import static java.lang.Integer.*;

public class BOJ_1012 {
    static int T;
    static int m,n,k;
    static int[][] arr;
    static boolean[][] visited;
    static int[] dx={-1,1,0,0};
    static int[] dy={0,0,-1,1};

    static int cnt;
    static Queue<Node> q;

    static class Node {
        int x;
        int y;

        public Node(int x, int y ){
            this.x = x;
            this.y = y;
        }
    }

    static boolean valid(int nx, int ny){
        return 0<= nx && nx <m && 0<= ny && ny <n;
    }

    static void bfs(){
        while(!q.isEmpty()){
            Node cur = q.poll();
            int cx = cur.x;
            int cy = cur.y;

            for(int i =0; i<4; i++){
                int nx = cx+dx[i];
                int ny = cy+dy[i];
                if(valid(nx,ny) && !visited[nx][ny] && arr[nx][ny]==1){
                    visited[nx][ny] = true;
                    q.add(new Node(nx,ny));
                }
            }

        }
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        T = parseInt(br.readLine());

        for(int tc =0; tc < T; tc++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            m=parseInt(st.nextToken());
            n=parseInt(st.nextToken());
            k=parseInt(st.nextToken());
            arr=new int[m][n];
            visited=new boolean[m][n];
            q = new LinkedList<>();
            cnt =0;

            for(int t =0; t<k;t++){
                st = new StringTokenizer(br.readLine());
                int a=parseInt(st.nextToken());
                int b=parseInt(st.nextToken());
                arr[a][b] =1;
            }

            for(int i =0; i<m; i++){
                for(int j =0; j<n; j++){
                    if(arr[i][j]==1 && !visited[i][j]){
                        q.add(new Node(i,j));
                        bfs();
                        cnt++;
                    }
                }
            }


            System.out.println(cnt);
        }

    }
}
