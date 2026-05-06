package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SWEA_13229 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        for(int tc =1; tc<=T; tc++){
            String day = br.readLine();

            sb.append("#").append(tc).append(" ");

            switch (day) {
                case "MON" : sb.append(6); break;
                case "TUE": sb.append(5); break;
                case "WED" : sb.append(4); break;
                case "THU" : sb.append(3); break;
                case "FRI": sb.append(2); break;
                case "SAT": sb.append(1); break;
                case "SUN": sb.append(7); break;

            }

            sb.append("\n");
        }
        System.out.println(sb);

    }

}
