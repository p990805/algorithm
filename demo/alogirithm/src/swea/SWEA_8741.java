package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SWEA_8741 {
    static char upperCase(String str){
        char tmp = str.charAt(0);
        return Character.toUpperCase(tmp);
    }
    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringBuilder sb = new StringBuilder();

       int T = Integer.parseInt(br.readLine());
       for(int tc =1; tc<=T; tc++){
           sb.append("#").append(tc).append(" ");
           StringTokenizer st = new StringTokenizer(br.readLine());
           while(st.hasMoreTokens()){
               sb.append(upperCase(st.nextToken()));
           }
           sb.append("\n");
       }
        System.out.println(sb);

    }

}
