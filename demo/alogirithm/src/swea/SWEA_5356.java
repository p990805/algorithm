package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SWEA_5356 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        for(int tc=1; tc<=T; tc++){
            char[][]arr = new char[5][15];

            int max_length = 0;
            for(int i=0; i<5; i++){
                String str = br.readLine();
                int len = str.length();
                max_length = Math.max(max_length, len);

                for(int j=0; j< len; j++){
                    arr[i][j] = str.charAt(j);
                }
            }

            sb.append("#").append(tc).append(" ");
            for(int i=0; i<max_length; i++){
                for(int j=0; j<5; j++){
                    if(arr[j][i] != 0 ){sb.append(arr[j][i]);}
                }
            }
             sb.append('\n');
        }
        System.out.println(sb.toString().trim());
    }
}
