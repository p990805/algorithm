package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SWEA_1213 {
    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringBuilder sb = new StringBuilder();

       int T = 10;
       for(int tc=1; tc<=T; tc++){
           int tcNum = Integer.parseInt(br.readLine());
           sb.append("#").append(tcNum).append(" ");

           String wantSearch = br.readLine();
           String str = br.readLine();

           int wantSearchNum = wantSearch.length();
           int len = str.length();
           int cnt =0;

           for(int i=0; i<=len-wantSearchNum; i++){
               String tmpStr = str.substring(i,i+wantSearchNum);
               if(tmpStr.equals(wantSearch)){
                   cnt++;
               }
           }
           sb.append(cnt).append("\n");
       }
        System.out.println(sb.toString().trim());

    }

}
