package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class SWEA_10570 {

    static boolean isPalindrome(int x) {
        String str = Integer.toString(x);
        int l = 0;
        int r = str.length() - 1;

        while(l<r){
            if(str.charAt(l)!=str.charAt(r)){
                return false;
            }
            l++;r--;
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        int[] nums = {1,2,3,4,11,22};
        Set<Integer> set = new HashSet<>();
        for(Integer num : nums){
            set.add(num);
        }

        for(int tc =1; tc<=T; tc++){
            String[] ints = br.readLine().split(" ");
            int a = Integer.parseInt(ints[0]);
            int b = Integer.parseInt(ints[1]);
            int cnt =0;

            for(int i=1 ; i*i<=b ; i++){
                int num = i*i;
                if(num >= a && isPalindrome(i) && isPalindrome(num) ){
                    cnt++;
                }
            }
            sb.append("#").append(tc).append(" ").append(cnt).append("\n");

        }
        System.out.println(sb);
    }
}
