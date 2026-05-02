package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SWEA_11688 {
    static int  left,right;
    static void l (){
        right = left + right;
    }
    static void r (){
        left = left + right;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int  T = Integer.parseInt(br.readLine());

        for(int tc =1; tc<=T; tc++){
            left =1;
            right =1;

            String str = br.readLine();
            for(int i =0; i<str.length(); i++){
                if(str.charAt(i)=='L'){
                    l();
                }else{
                    r();
                }
            }
            sb.append("#").append(tc).append(" ").append(left).append(" ").append(right).append("\n");
        }
        System.out.println(sb);

    }

}
