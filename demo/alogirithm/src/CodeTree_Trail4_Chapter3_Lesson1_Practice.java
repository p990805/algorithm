import java.io.*;
import java.util.*;
import static java.lang.Integer.*;


public class CodeTree_Trail4_Chapter3_Lesson1_Practice {
    static int n;
    static int[][] arr;
    static boolean[][] visited;
    static int[]dx = {-1,1,0,0};
    static int[]dy = {0,0,-1,1};

    static boolean valid(int nx, int ny){
        return 0<= nx && nx < n && 0<=ny && ny <n;
    }

    static int dfs(int cx, int cy){
        int cnt =1;

        visited[cx][cy] = true;

        for(int i =0; i<4 ;i++){
            int nx = cx+dx[i];
            int ny = cy+dy[i];
            if(valid(nx,ny) && arr[nx][ny] == 1 && !visited[nx][ny]){
                cnt += dfs(nx,ny);
            }
        }
        return cnt;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> sizes = new ArrayList<>();


        n = parseInt(br.readLine());
        arr = new int[n][n];
        visited = new boolean[n][n];

        for(int i =0; i<n;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0;j<n;j++){
                arr[i][j] = parseInt(st.nextToken());
            }
        }

        for(int i =0; i<n;i++){
            for (int j =0; j<n;j++){
               if(arr[i][j] ==1 && !visited[i][j]){
                   int size = dfs(i,j);
                   sizes.add(size);
               }
            }
        }
        int[] tmp = new int[sizes.size()];
        for(int i =0; i<sizes.size();i++){
            tmp[i] = sizes.get(i);
        }
        Arrays.sort(tmp);
        StringBuilder sb = new StringBuilder();
        sb.append(tmp.length).append("\n");
        for(int i =0; i<tmp.length;i++){
            sb.append(tmp[i]).append("\n");
        }

        System.out.println(sb.toString().trim());
    }
}
