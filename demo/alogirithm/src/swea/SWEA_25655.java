package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SWEA_25655 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int puzzleNum = Integer.parseInt(br.readLine());

            if(puzzleNum ==1) {
                sb.append("0").append("\n");
            } else if(puzzleNum %2==0) {
                for(int i =1; i<= puzzleNum/2;i++){
                    sb.append("8");
                }
                sb.append("\n");
            } else{
                sb.append("4");
                for(int i =1; i<= puzzleNum/2;i++){
                    sb.append("8");
                }
                sb.append("\n");
            }
        }

        System.out.println(sb.toString().trim());
    }

}
