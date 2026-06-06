package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SWEA_5515 {
    static int[] days = new int[]{31,29,31,30,31,30,31,31,30,31,30,31};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        for(int tc=1; tc<=T; tc++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int m = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());

            int total = 0;
            for(int i=0; i<m-1; i++){
                total += days[i];
            }
            total += (d - 1);

            int result = (4 + total) % 7;
            sb.append("#").append(tc).append(" ").append(result).append('\n');
        }
        System.out.print(sb.toString().trim());
    }
}