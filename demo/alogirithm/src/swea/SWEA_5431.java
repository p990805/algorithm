package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SWEA_5431 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        for(int tc =1; tc<=T; tc++){
            sb.append("#").append(tc).append(" ");
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            boolean[] check = new boolean[n+1];
            st = new StringTokenizer(br.readLine());
            for(int i =0; i<k; i++){
                int num = Integer.parseInt(st.nextToken());
                check[num] = true;
            }

            for(int i=1; i<=n;i++){
                if(!check[i]){
                    sb.append(i).append(" ");
                }
            }
            sb.append("\n");
        }
        System.out.println(sb);

    }

}
