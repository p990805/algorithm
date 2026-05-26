package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SWEA_3499 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine().trim());
        for (int tc = 1; tc <= T; tc++) {
            sb.append("#").append(tc).append(" ");
            int n = Integer.parseInt(br.readLine().trim());

            int len1 = (n + 1) / 2;
            int len2 = n / 2;
            String[] arr1 = new String[len1];
            String[] arr2 = new String[len2];

            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < len1; i++) arr1[i] = st.nextToken();
            for (int i = 0; i < len2; i++) arr2[i] = st.nextToken();

            int f = 0, s = 0;
            for (int i = 0; i < n; i++) {
                if (i % 2 == 0) sb.append(arr1[f++]);
                else            sb.append(arr2[s++]);
                if (i < n - 1) sb.append(" ");
            }
            sb.append("\n");
        }
        System.out.print(sb.toString().trim());
    }
}