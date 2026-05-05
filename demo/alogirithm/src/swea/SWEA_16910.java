package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SWEA_16910 {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine().trim());

        for(int tc =1; tc<=T; tc++){
            int n = Integer.parseInt(br.readLine());
            int minus = -n;
            int cnt =1;

            for(int i = minus; i<=n; i++){
                for(int j = minus; j<=n; j++){
                    if(i==0 && j==0){
                        continue;
                    }
                    int a = i*i;
                    int b = j*j;
                    int c = n*n;
                    if(a+b <=c){
                        cnt++;
                    }
                }

            }
            sb.append("#").append(tc).append(" ").append(cnt).append("\n");
        }
        System.out.println(sb);

    }

}
