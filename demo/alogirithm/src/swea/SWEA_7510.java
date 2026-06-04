package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SWEA_7510 {
    static int cnt;

    static void bt (int n, int sum, int goal ){
        if(sum > goal) {
            return;
        }
        if(sum == goal){
            cnt++;
            return;
        }
        bt(n+1, sum + n, goal);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        for(int tc=1; tc<=T; tc++){

            int n = Integer.parseInt(br.readLine());
            cnt =0;
            for(int i=1; i<=n; i++) {
                bt(i,0,n);
            }
            sb.append("#").append(tc).append(" ").append(cnt).append("\n");
        }
        System.out.println(sb.toString().trim());
    }
}
