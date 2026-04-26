package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class BOJ_1316 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int cnt =0;

        while(n-- > 0 ){
            Set<Character> set = new HashSet<>();
            String s = br.readLine();
            char[] chars = s.toCharArray();
            boolean flag = true;

            for(int i=0; i<chars.length; i++){
                if(set.contains(chars[i])){
                    if(chars[i-1] == chars[i]){
                        continue;
                    }else{
                        flag = false;
                        break;
                    }
                } else {
                    set.add(chars[i]);
                }
            }
            if(flag){
                cnt++;
            }
        }
        System.out.println(cnt);

    }

}
