package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class SWEA_23791 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int tc = Integer.parseInt(br.readLine());

        while(tc -- > 0){
            int n = Integer.parseInt(br.readLine());
            int[] aRank = new int[n];
            int[] bRank = new int[n];
            String[] player = new String[n+1];
            Arrays.fill(player,"Not Yet");

            st = new StringTokenizer(br.readLine());
            for(int i =0; i<n; i++){
                aRank[i] = Integer.parseInt(st.nextToken());
            }
            st = new StringTokenizer(br.readLine());
            for(int i =0; i<n; i++){
                bRank[i] = Integer.parseInt(st.nextToken());
            }
            int aIndex = 0;
            int bIndex = 0;
            for (int i = 0; i < n; i++) {
                if (i % 2 == 0) {
                    while (!player[aRank[aIndex]].equals("Not Yet")) {
                        aIndex++;
                    }
                    player[aRank[aIndex]] = "A";
                    aIndex++;
                } else {
                    while (!player[bRank[bIndex]].equals("Not Yet")) {
                        bIndex++;
                    }
                    player[bRank[bIndex]] = "B";
                    bIndex++;
                }
            }

            for(int i =1; i<=n; i++){
                sb.append(player[i]);
            }
            sb.append("\n");
        }
        System.out.println(sb.toString().trim());

    }

}
