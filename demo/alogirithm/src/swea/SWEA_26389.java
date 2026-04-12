package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class SWEA_26389 {

    static boolean check (int x, int y) {
        return x==0 && y==0;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        while (n-- > 0) {

            int x =0;
            int y =0;
            Set<Character> dir = new HashSet<>();

            String command = br.readLine();

            for(int i =0; i< command.length(); i++) {
                char c = command.charAt(i);
                dir.add(c);
            }

            for(char c : dir) {
                switch (c) {
                    case 'N' : y++; break;
                    case 'E' : x++; break;
                    case 'W' : x--; break;
                    case 'S' : y--; break;
                    default : break;
                }
            }

            sb.append(check(x,y)? "Yes": "No").append("\n");
        }

        System.out.println(sb.toString().trim());

    }

}
