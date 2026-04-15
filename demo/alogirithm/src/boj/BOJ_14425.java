package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class BOJ_14425 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Set<String> words = new HashSet<>();

        int cnt =0;

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        while(n-- > 0){
            String word = br.readLine();
            words.add(word);
        }

        while(m-- >0) {
            String word = br.readLine();
            if(words.contains(word)) {
                cnt++;
            }

        }

        System.out.println(cnt);

    }

}
