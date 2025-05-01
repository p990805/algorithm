import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.StringTokenizer;
import java.util.Queue;
import java.util.LinkedList;
import static java.lang.Integer.parseInt;


public class BOJ_14716 {
    static int[] dx = {-1,1,0,0,-1,-1,1,1};
    static int[] dy = {0,0,-1,1,-1,1,-1,1};
    static class Node {
        int x;
        int y;
        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    static int m,n;
    static int cnt;

    static boolean valid(int nx, int ny){
        return 0<= nx && nx < m && 0<= ny && ny < n;
    }

    static int[][] map;
    static boolean[][] visited;

    static void bfs(int startX, int startY){
        Queue<Node> q = new LinkedList<>();
        q.add(new Node(startX, startY));
        visited[startX][startY] = true;

        while(!q.isEmpty()){
            Node cur = q.poll();
            int cx = cur.x;
            int cy = cur.y;

            for(int i=0; i<8; i++){
                int nx = cx + dx[i];
                int ny = cy + dy[i];
                if(valid(nx,ny) && !visited[nx][ny] && map[nx][ny]==1){
                    visited[nx][ny] = true;
                    q.add(new Node(nx,ny));
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        m = parseInt(st.nextToken());
        n = parseInt(st.nextToken());
        visited = new boolean[m][n];
        map = new int[m][n];
        for(int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < n; j++) {
                map[i][j] = parseInt(st.nextToken());
            }
        }

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(map[i][j] == 1 && !visited[i][j]) {
                    bfs(i, j);
                    cnt++;
                }
            }
        }

        System.out.println(cnt);
    }
}