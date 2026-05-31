package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SWEA_10200 {
    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringBuilder sb = new StringBuilder();

       int T = Integer.parseInt(br.readLine());
       for(int tc=1; tc<=T; tc++){
           StringTokenizer st = new StringTokenizer(br.readLine());
           int n = Integer.parseInt(st.nextToken());
           int p = Integer.parseInt(st.nextToken());
           int t = Integer.parseInt(st.nextToken());

           int max = Math.min(p,t);
           int min;

           int tmp = (p+t) - n;
           min = (tmp > 0) ? tmp : 0;

           sb.append("#").append(tc).append(" ").append(max).append(" ").append(min).append("\n");
       }
       System.out.println(sb.toString().trim());
    }

}
