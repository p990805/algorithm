package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class SWEA_10804 {
    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringBuilder sb = new StringBuilder();
       Map<Character,Character> map = new HashMap<>();
       map.put('b','d');
       map.put('d','b');
       map.put('p','q');
       map.put('q','p');

       int T = Integer.parseInt(br.readLine());
       for(int tc=1; tc<=T; tc++){
           sb.append("#").append(tc).append(" ");
           String str = br.readLine();
           int len = str.length();
           for(int i = len-1; i>=0; i--) {
               sb.append(map.get(str.charAt(i)));
           }
           sb.append("\n");
       }
        System.out.println(sb);
    }

}
