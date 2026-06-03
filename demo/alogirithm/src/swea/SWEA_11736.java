package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SWEA_11736 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        for(int tc=1; tc<=T; tc++){

            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];

            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int i=0; i<n; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            int cnt =0;

            for(int i=1; i<n-1; i++){
                int firstNum = arr[i-1];
                int secondNum = arr[i];
                int thirdNum = arr[i+1];

                int beforeNum = Math.min(thirdNum,(Math.min(firstNum, secondNum)));
                int afterNum = Math.max(thirdNum,(Math.max(firstNum, secondNum)));

                if(secondNum != beforeNum && secondNum != afterNum ){
                    cnt++;
                }
            }

            sb.append("#").append(tc).append(" ").append(cnt).append("\n");
        }
        System.out.println(sb.toString().trim());
    }
}
