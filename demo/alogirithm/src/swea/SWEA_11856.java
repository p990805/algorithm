package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class SWEA_11856 {
    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringBuilder sb = new StringBuilder();

       int T  = Integer.parseInt(br.readLine());
       for(int tc=1; tc<=T; tc++){
           Map<Character,Integer> map = new HashMap<>();

           String str = br.readLine();
           for(int i=0;i<str.length();i++){
               char ch = str.charAt(i);
               map.put(ch,map.getOrDefault(ch,0)+1);
           }

           boolean flag = true;
           for(Entry<Character,Integer> entry:map.entrySet()){
               if(map.size()!=2) {
                   flag = false;
                   break;
               }

               if(entry.getValue()!=2){
                   flag = false;
                   break;
               }

           }
           sb.append("#").append(tc).append(" ");
           if(flag) sb.append("Yes");
           else sb.append("No");
           sb.append("\n");
       }
       System.out.println(sb.toString().trim());
    }

}
