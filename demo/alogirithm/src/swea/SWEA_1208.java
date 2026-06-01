package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SWEA_1208 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = 10;
        for(int tc=1; tc<=T;tc++){
            int dump = Integer.parseInt(br.readLine());
            int[] arr = new int[101];

            StringTokenizer st = new StringTokenizer(br.readLine());
            while(st.hasMoreTokens()){
                arr[Integer.parseInt(st.nextToken())]++;
            }
            int min=0;
            int max =100;

            for(int i=0; i<dump; i++){
                while(arr[min] ==0) min++;
                while(arr[max] ==0) max--;

                if(min>max) break;

                arr[min]--;
                arr[min+1]++;
                arr[max]--;
                arr[max-1]++;
            }
            while(arr[min] ==0) min++;
            while(arr[max] ==0) max--;
            sb.append("#").append(tc).append(" ").append(max-min).append("\n");
       }
       System.out.println(sb.toString().trim());
    }

}
