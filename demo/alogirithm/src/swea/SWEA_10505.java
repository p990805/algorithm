package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class SWEA_10505 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for(int tc =1; tc<= T; tc++){
            sb.append("#" + tc + " ");
            int sum = 0;
            int cnt = 0;

            int n = Integer.parseInt(br.readLine());
            int[] numbers = new int[n];

            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int i =0; i< n; i++){
                int num = Integer.parseInt(st.nextToken());
                numbers[i] = num;
                sum += num;
            }

            int avg = sum / n;

            Arrays.sort(numbers);

            for(int i =0; i< n; i++){
                if(numbers[i] > avg){
                    break;
                }
                if(numbers[i] <= avg){
                    cnt++;
                }
            }
            sb.append(cnt+"\n");
        }
        System.out.println(sb.toString().trim());

    }

}
