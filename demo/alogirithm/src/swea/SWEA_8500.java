package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class SWEA_8500 {
    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringBuilder sb = new StringBuilder();

       int T = Integer.parseInt(br.readLine());
       for(int tc=1; tc<=T; tc++){
           int N = Integer.parseInt(br.readLine());
           Integer[] arr = new Integer[N];
           StringTokenizer st = new StringTokenizer(br.readLine());
           for(int i=0;i<N;i++){
               arr[i] = Integer.parseInt(st.nextToken());
           }
           Arrays.sort(arr,(a,b) -> b-a);

           int cnt =0;
           cnt += arr[0] *2 +1;
           for(int i=1;i<N;i++){
               cnt+= arr[i] +1;
           }
           sb.append("#").append(tc).append(" ").append(cnt).append("\n");
       }
       System.out.println(sb);
    }

}
