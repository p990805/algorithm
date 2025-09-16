package boj;

import java.io.*;

public class BOJ_17609 {
    static boolean palindrome(String s, int startIndex, int endIndex) {
        while (startIndex < endIndex) {
            if(s.charAt(startIndex) != s.charAt(endIndex)) {
                return false;
            }
            startIndex++;
            endIndex--;
        }
        return true;
    }
    static int check(String s) {
        int n = s.length();
        if(palindrome(s, 0, n-1)) {
            return 0;
        }
        int left = 0, right = n-1;

        while(left < right) {
            if(s.charAt(left) == s.charAt(right)) {
                left++;
                right--;
            } else {
                if(palindrome(s, left+1, right)) {
                    return 1;
                }
                if(palindrome(s, left, right-1)) {
                    return 1;
                }
                return 2;
            }
        }
        return 1;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        for(int i =0; i< N; i++) {
            String s = br.readLine();
            int result = check(s);
            sb.append(result).append("\n");
        }
        System.out.println(sb.toString().trim());
    }
}
