package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SWEA_13547 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        for(int tc=1; tc<=T; tc++){

            String result = br.readLine();
            int len = result.length();

            int count =0;

            for(int i=0; i<len; i++){
                if(result.charAt(i) == 'x') count++;
            }

            String answer = (count >= 8) ? "NO" : "YES";
            sb.append("#").append(tc).append(" ").append(answer).append("\n");
        }
        System.out.println(sb.toString().trim());
    }
}
