package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SWEA_1215 {
    static boolean isPalindrome(String str) {
        int s = 0, e = str.length() - 1;
        while (s < e) {
            if (str.charAt(s++) != str.charAt(e--)) return false;
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = 10;
        for (int tc = 1; tc <= T; tc++) {
            int len = Integer.parseInt(br.readLine());
            char[][] arr = new char[8][8];
            for (int i = 0; i < 8; i++) {
                String line = br.readLine();
                for (int j = 0; j < 8; j++) arr[i][j] = line.charAt(j);
            }

            int cnt = 0;

            for (int i = 0; i < 8; i++) {
                for (int j = 0; j <= 8 - len; j++) {
                    if (isPalindrome(new String(arr[i], j, len))) cnt++;
                }
            }

            for (int i = 0; i < 8; i++) {
                for (int j = 0; j <= 8 - len; j++) {
                    StringBuilder tmp = new StringBuilder();
                    for (int k = 0; k < len; k++) {
                        tmp.append(arr[j + k][i]);
                    }
                    if (isPalindrome(tmp.toString())) cnt++;
                }
            }

            sb.append("#").append(tc).append(" ").append(cnt).append("\n");
        }
        System.out.print(sb);
    }
}