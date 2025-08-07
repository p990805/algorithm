import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1952 {
    static int M, N;
    static boolean[][] visited;
    static int cnt = 0;
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};

    static boolean valid(int x, int y){
        return 0 <= x && x < M && 0 <= y && y < N && !visited[x][y];
    }

    static void snail(){
        int x = 0, y = 0;
        int dir = 0;
        visited[x][y] = true;

        while(true){
            int nx = x + dx[dir];
            int ny = y + dy[dir];

            if(valid(nx, ny)){
                x = nx;
                y = ny;
                visited[x][y] = true;
            } else {
                cnt++;
                dir = (dir + 1) % 4;
                nx = x + dx[dir];
                ny = y + dy[dir];

                if(valid(nx, ny)){
                    x = nx;
                    y = ny;
                    visited[x][y] = true;
                } else {
                    break;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());

        visited = new boolean[M][N];
        snail();
        System.out.println(cnt-1);
    }
}