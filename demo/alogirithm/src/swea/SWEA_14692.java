package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SWEA_14692 {
    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringBuilder sb = new StringBuilder();

       int T = Integer.parseInt(br.readLine());
       for(int tc =1; tc<=T; tc++){
           sb.append("#").append(tc).append(" ");
           int n = Integer.parseInt(br.readLine());
           String answer = (n%2==0) ? "Alice":"Bob";
           sb.append(answer).append("\n");
       }
        System.out.println(sb);

    }

}
