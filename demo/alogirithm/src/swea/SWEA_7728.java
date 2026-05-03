package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class SWEA_7728 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        for(int tc = 1; tc <= T; tc++) {
            Set<Integer> set = new HashSet<>();

            String str = br.readLine();
            for(int i=0; i<str.length(); i++){
                set.add(Integer.parseInt(str.charAt(i)+""));
            }

            sb.append("#").append(tc).append(" ").append(set.size()).append("\n");
        }
        System.out.println(sb);

    }

}
