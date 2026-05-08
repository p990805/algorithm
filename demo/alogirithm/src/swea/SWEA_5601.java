package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SWEA_5601 {
    public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringBuilder sb = new StringBuilder();

      int T = Integer.parseInt(br.readLine().trim());
      for(int tc =1; tc<=T;tc++){
           sb.append("#").append(tc).append(" ");
           int n = Integer.parseInt(br.readLine());
           for(int i =0; i<n;i++){
               String answer = 1+"/"+n;
               sb.append(answer).append(" ");
           }
           sb.append("\n");
      }
      System.out.println(sb);
    }

}
