package codetree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class CodeTree_숫자가더큰인접한곳으로이동 {
    static int[]dx = {-1,1,0,0};
    static int[]dy = {0,0,-1,1};
    static int n;
    static int r;
    static int c;
    static int[][]arr;
    static boolean valid(int nx, int ny) {
        return nx >= 0 && ny >= 0 && nx < n && ny < n;
    }
    static List<Integer> answer = new ArrayList<>();
    static void solution () {
        int max = arr[r][c];
        int mr =r;
        int mc =c;

        for(int i = 0; i < 4; i++) {
            int nx = r+dx[i];
            int ny = c+dy[i];
            if(valid(nx, ny) && arr[nx][ny] > max) {
                max = arr[nx][ny];
                mr = nx;
                mc = ny;
            }
        }

        r = mr;
        c = mc;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st =  new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        r = Integer.parseInt(st.nextToken())-1;
        c = Integer.parseInt(st.nextToken())-1;

        arr = new int[n][n];

        for(int i=0;i<n;i++){
            st =  new StringTokenizer(br.readLine());
            for(int j=0;j<n;j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        answer.add(arr[r][c]);

        boolean flag = true;
        while (flag) {
            int flagSize = answer.size();
            solution();
            if(answer.size() == flagSize) {
                flag = false;
                break;
            }
        }
        StringBuilder sb = new StringBuilder();
        int len = answer.size();
        for(int ii=0;ii<len;ii++){
            sb.append(answer.get(ii)).append(" ");
        }
        System.out.println(sb.toString().trim());

    }

}
