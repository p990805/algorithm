package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class BOJ_1620 {
    static boolean isNum(String str) {
        char first = str.charAt(0);
        return Character.isDigit(first);
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        Map<String,Integer> pokemonForName = new HashMap<>();
        Map<Integer,String> pokemonForNum = new HashMap<>();

        int num = 1;

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        while(n-- > 0) {
            String pokemonName = br.readLine();
            pokemonForName.put(pokemonName, num);
            pokemonForNum.put(num, pokemonName);
            num ++;
        }

        while(m-- > 0) {
            String question = br.readLine();
            if(isNum(question)) {
                sb.append(pokemonForNum.get(Integer.parseInt(question))).append("\n");
            } else {
                sb.append(pokemonForName.get(question)).append("\n");
            }
        }

        System.out.println(sb.toString());

    }

}
