import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SWEA_6730 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());
        for(int tc = 1; tc <= t; tc++) {
            int n = Integer.parseInt(br.readLine());
            int[]arr = new int[n];

            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int i =0; i<n; i++){
                arr[i] = Integer.parseInt(st.nextToken());
            }

            int highUp =0;
            int highDown =0;
            for(int i =1; i<n; i++){
                if(arr[i]> arr[i-1]){
                    int gap = arr[i] - arr[i-1];
                    highUp = Math.max(highUp, gap);
                } else if(arr[i] < arr[i-1]){
                    int gap = arr[i-1] - arr[i];
                    highDown = Math.max(highDown, gap);
                }
            }

            sb.append("#").append(tc).append(" ").append(highUp).append(" ").append(highDown).append("\n");
        }
        System.out.println(sb.toString().trim());

    }

}
