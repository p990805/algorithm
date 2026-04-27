package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SWEA_12221 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        for(int tc =1; tc<=n; tc++){
            sb.append("#"+tc+" ");
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            if( a>=10 || b>=10) {
                sb.append(-1+"\n");
            } else {
                sb.append(a*b+"\n");
            }
        }
        System.out.println(sb);
    }

}
