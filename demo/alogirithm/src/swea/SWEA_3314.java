package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SWEA_3314 {
    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringBuilder sb = new StringBuilder();

       int T = Integer.parseInt(br.readLine());
       for(int tc =1; tc<=T;tc++){
           StringTokenizer st = new StringTokenizer(br.readLine());
           int sum =0;
           int cnt =0;

           while(st.hasMoreTokens()){
               int num = Integer.parseInt(st.nextToken());
               if(num <= 40) {
                   num = 40;
               }
               sum += num;
               cnt++;
           }

           int answer = sum/cnt;
           sb.append("#").append(tc).append(" ").append(answer).append("\n");
       }
       System.out.println(sb);
    }

}
