package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class SWEA_24420 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= T; tc++) {
            br.readLine();

            Set<Integer> setA = new HashSet<>();
            StringTokenizer stA = new StringTokenizer(br.readLine());
            while (stA.hasMoreTokens()) {
                setA.add(Integer.parseInt(stA.nextToken()));
            }

            Set<Integer> setB = new HashSet<>();
            StringTokenizer stB = new StringTokenizer(br.readLine());
            while (stB.hasMoreTokens()) {
                setB.add(Integer.parseInt(stB.nextToken()));
            }

            boolean aInB = setB.containsAll(setA);
            boolean bInA = setA.containsAll(setB);

            char result;
            if (aInB && bInA) {
                result = '=';
            } else if (aInB) {
                result = '<';
            } else if (bInA) {
                result = '>';
            } else {
                result = '?';
            }

            sb.append(result).append('\n');
        }
        System.out.println(sb);
    }
}