package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SWEA_3456 {
    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringBuilder sb = new StringBuilder();

       int T = Integer.parseInt(br.readLine());
       for(int tc =1; tc<=T;tc++){
           StringTokenizer st =  new StringTokenizer(br.readLine());
           int firstNum = Integer.parseInt(st.nextToken());
           int secondNum = Integer.parseInt(st.nextToken());
           int thirdNum = Integer.parseInt(st.nextToken());

           int answer = firstNum^secondNum^thirdNum;
           sb.append("#").append(tc).append(" ").append(answer).append("\n");
       }
        System.out.println(sb);
    }

}
