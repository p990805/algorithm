package boj;

import java.io.*;

public class BOJ_10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String s = br.readLine();
        char[] chars = s.toCharArray();

        int[] alphabets = new int[26];
        alphabets[chars[0] - 'a'] = 101;

        for(int i =1; i< chars.length; i++) {
            if(alphabets[chars[i] - 'a'] != 0){
                continue;
            }else{
                alphabets[chars[i] - 'a'] = i;
            }
        }


        for(int i =0; i< alphabets.length; i++) {
           if(alphabets[i] == 101){
               sb.append(0).append(" ");
           } else if (alphabets[i] == 0){
               sb.append(-1).append(" ");
           } else{
               sb.append(alphabets[i]).append(" ");
           }
        }
        System.out.println(sb.toString().trim());

    }
}