package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SWEA_6913 {
    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringBuilder sb = new StringBuilder();
       StringTokenizer st;

       int T = Integer.parseInt(br.readLine());
       for(int tc=1; tc<=T;tc++){
           sb.append("#").append(tc).append(" ");
           st = new StringTokenizer(br.readLine());
           int n = Integer.parseInt(st.nextToken());
           int m = Integer.parseInt(st.nextToken());


           int max =Integer.MIN_VALUE;
           int cnt = 0;

           for(int i=1; i<=n; i++){
               st = new StringTokenizer(br.readLine());
               int sum =0;

               for(int j =0; j<m;j++){
                   int score = Integer.parseInt(st.nextToken());
                   if(score ==1){
                       sum++;
                   }
               }

               if(sum > max){
                   max = sum;
                   cnt =1;
               } else if(sum == max){
                   cnt ++;
               }
           }

           sb.append(cnt).append(" ").append(max).append("\n");
       }
       System.out.println(sb);
    }

}
