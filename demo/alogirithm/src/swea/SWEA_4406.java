package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class SWEA_4406 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Set<Character> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();

        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');

        int T = Integer.parseInt(br.readLine());
        for(int tc = 1; tc <= T; tc++) {
            String str = br.readLine();
            sb.append("#").append(tc).append(" ");

            for(int i=0; i<str.length(); i++) {
                char ch = str.charAt(i);
                if(!set.contains(ch)) {
                    sb.append(ch);
                }
            }
            sb.append("\n");
        }

        System.out.println(sb.toString().trim());
    }

}
