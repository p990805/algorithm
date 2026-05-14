package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SWEA_5549 {
    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringBuilder sb = new StringBuilder();

       int T = Integer.parseInt(br.readLine());
       for(int tc =1; tc<=T; tc++){
           sb.append("#").append(tc).append(" ");

           String num = br.readLine();
           int len = num.length();

           int  lastNum = Integer.parseInt(num.substring(len-1));
           String answer = (lastNum%2==0) ? "Even" : "Odd";
           sb.append(answer).append("\n");
       }
        System.out.println(sb);
    }

}
