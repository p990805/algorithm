package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class SWEA_8821 {



    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringBuilder sb = new StringBuilder();

       int T = Integer.parseInt(br.readLine());
       for(int tc=1; tc<=T; tc++){
           Map<Character,Integer> map = new HashMap<>();
           String str = br.readLine();

           int len = str.length();
           for(int i=0; i<len; i++){
               char ch = str.charAt(i);
               if(map.containsKey(ch)){
                   map.remove(ch);
               } else {
                   map.put(ch, 1);
               }
           }

           sb.append("#").append(tc).append(" ").append(map.size()).append("\n");
       }
       System.out.println(sb.toString().trim());
    }

}
