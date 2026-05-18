package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SWEA_9997 {
    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringBuilder sb = new StringBuilder();

       int T = Integer.parseInt(br.readLine());
       for(int tc=1; tc<=T; tc++){
           sb.append("#").append(tc).append(" ");
           int gak = Integer.parseInt(br.readLine());

           // 일단 각 1당 2분
           //그럼 시간은 몇 도일까 30에 1시간

           int h = gak/30;
           if(h==12){
               h=0;
           }
           int m = gak%30;

           sb.append(h).append(" ").append(m*2).append("\n");
       }
       System.out.println(sb);
    }

}
