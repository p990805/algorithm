import java.io.*;

import static java.lang.Integer.parseInt;

public class SWEA_1288 {
    static int T;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        T = parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int tc = 1; tc<=T; tc++){
            int originalN = parseInt(br.readLine());
            int n = originalN;
            boolean[] counts = new boolean[10];
            int multiplier = 1;

            while(true){
                String num = String.valueOf(n);
                for(int i=0; i<num.length(); i++){
                    int tmp = parseInt(String.valueOf(num.charAt(i)));
                    counts[tmp] = true;
                }

                int cnt = 0;
                for(int i=0; i<10; i++){
                    if(counts[i]){
                        cnt++;
                    }
                }

                if(cnt == 10){
                    break;
                }

                multiplier++;
                n = originalN * multiplier;

                // 무한 루프 방지를 위한 제한 (선택적)
                if(multiplier > 100) {
                    n = -1; // 불가능한 경우
                    break;
                }
            }

            sb.append("#").append(tc).append(" ").append(n).append("\n");
        }
        System.out.println(sb.toString().trim());
    }
}