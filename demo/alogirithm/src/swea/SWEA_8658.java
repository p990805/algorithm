package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SWEA_8658 {
    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringBuilder sb = new StringBuilder();
       StringTokenizer st;

       int T = Integer.parseInt(br.readLine());
       for(int tc =1; tc<=T; tc++){
           sb.append("#").append(tc).append(" ");
           st = new StringTokenizer(br.readLine());
           int max = Integer.MIN_VALUE;
           int min = Integer.MAX_VALUE;

           for(int i=0; i<10; i++){
               String[] num = st.nextToken().split("");
               int sum =0;
               for(int j=0; j<num.length;j++){
                   sum+= Integer.parseInt(num[j]);
               }
               max = Math.max(max, sum);
               min = Math.min(min, sum);
           }
           sb.append(max).append(" ").append(min).append("\n");
       }
       System.out.println(sb);
    }

}
