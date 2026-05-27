package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SWEA_26792 {
    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringBuilder sb = new StringBuilder();

       int T = Integer.parseInt(br.readLine());
       for(int tc=1; tc<=T; tc++){
           StringTokenizer st = new StringTokenizer(br.readLine());
           int x = Integer.parseInt(st.nextToken());
           int y = Integer.parseInt(st.nextToken());

           int a = (x+y)/2;
           int b = x-a;

           sb.append(a).append(" ").append(b).append("\n");
       }
       System.out.println(sb.toString().trim());
    }

}
