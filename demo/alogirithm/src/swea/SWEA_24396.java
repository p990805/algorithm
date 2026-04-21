package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SWEA_24396 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int b = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            int bBoxScore = Integer.parseInt(st.nextToken());
            int wBoxScore = Integer.parseInt(st.nextToken());
            int wrongBoxScore = Integer.parseInt(st.nextToken());

            int option1 = b * bBoxScore + w * wBoxScore;
            int option2;
            if (b <= w) {
                option2 = 2 * b * wrongBoxScore + (w - b) * wBoxScore;
            } else {
                option2 = (b - w) * bBoxScore + 2 * w * wrongBoxScore;
            }
            int totalScore = Math.max(option1, option2);
            sb.append(totalScore).append("\n");
        }
        System.out.println(sb);

    }

}
