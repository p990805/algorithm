package basic;

import java.io.*;

public class Find_Not_Repeat_First_Alphabet {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        char[] alphabets = s.toCharArray();
        int [] arr = new int[26];
        char answer = '_';
        for(int i = 0; i < s.length(); i++) {
            arr[alphabets[i] - 'a']++;
        }

        for(int i =0; i< alphabets.length; i++) {
            int index = arr[alphabets[i] - 'a'];
            if(index ==1) {
                answer = alphabets[i];
                break;
            } else if(index > 1) {
                continue;
            } else {
                continue;
            }
        }
        System.out.println(answer);
    }
}