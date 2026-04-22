package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SWEA_24001 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int tc = Integer.parseInt(br.readLine());

        while(tc -- > 0){
            int distance =0;
            int maxDistance =0;
            int qCount =0;
            String command = br.readLine();
            char[] arr = command.toCharArray();
            for (int i = 0; i < arr.length; i++) {
                if(arr[i] == 'L'){
                    distance--;
                } else if(arr[i] == 'R'){
                    distance++;
                } else if(arr[i] == '?'){
                    qCount++;
                }
                maxDistance = Math.max(maxDistance, Math.max(Math.abs(distance-qCount),Math.abs(distance+qCount)));
            }

            sb.append(maxDistance).append("\n");
        }
        System.out.println(sb.toString().trim());

    }
}
