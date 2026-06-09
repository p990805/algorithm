package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SWEA_1209 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = 10;
        for(int tc=1; tc<=T; tc++){
            int testNum = Integer.parseInt(br.readLine());

            int[][]arr = new int[100][100];

            for(int i=0; i<100; i++){
                StringTokenizer st = new StringTokenizer(br.readLine());
                for(int j=0; j<100; j++){
                    arr[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            int max = 0;
            for(int i=0; i<100; i++){
                int sum = 0;
                for(int j=0; j<100; j++){
                    sum+=arr[i][j];
                }
                max = Math.max(max, sum);
            }

            for(int i=0; i<100; i++){
                int sum = 0;
                for(int j=0; j<100; j++){
                    sum += arr[j][i];
                }
                max = Math.max(max, sum);
            }

            int d1 = 0, d2 = 0;
            for(int i=0; i<100; i++){
                d1 += arr[i][i];
                d2 += arr[i][99-i];
            }
            max = Math.max(max, Math.max(d1, d2));
            sb.append("#").append(tc).append(" ").append(max).append("\n");
        }
        System.out.println(sb);
    }
}
