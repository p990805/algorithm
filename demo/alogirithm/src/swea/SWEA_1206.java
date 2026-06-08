package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SWEA_1206 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = 10;
        for(int tc=1; tc<=T; tc++){
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];

            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int i=0; i<n; i++){
                arr[i] = Integer.parseInt(st.nextToken());
            }

            int cnt =0;
            for(int i = 2; i<n-2;i++){
                int leftOne = arr[i-2];
                int leftTwo = arr[i-1];
                int middle = arr[i];
                int rightOne = arr[i+1];
                int rightTwo = arr[i+2];

                if(leftOne < middle && leftTwo < middle && rightOne < middle && rightTwo < middle){
                    int leftMax = Math.max(leftOne, leftTwo);
                    int rightMax = Math.max(rightOne, rightTwo);

                    int leftRightMax = Math.max(leftMax, rightMax);
                    cnt+= middle - leftRightMax;
                }
            }

            sb.append("#").append(tc).append(" ").append(cnt).append("\n");

        }
        System.out.println(sb.toString().trim());
    }
}
