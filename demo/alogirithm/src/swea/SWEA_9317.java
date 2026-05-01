package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SWEA_9317 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());
        for(int tc =1; tc<=t;tc++){
            int n = Integer.parseInt(br.readLine());
            char[] answer = br.readLine().toCharArray();
            char[] str = br.readLine().toCharArray();
            int cnt =0;

            for(int i=0;i<n;i++){
                if(answer[i] == str[i]){
                    cnt++;
                }
            }

            sb.append("#").append(tc).append(" ").append(cnt).append("\n");
        }
        System.out.println(sb);
    }
}
