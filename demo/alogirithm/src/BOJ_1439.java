import java.io.*;

public class BOJ_1439 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        int one = 0;
        int zero = 0;

        if(s.charAt(0) == '0'){
            zero++;
        } else { one++;}
        for(int i =1; i<s.length(); i++){
            if(s.charAt(i) == s.charAt(i-1)){
                continue;
            } else{
                if(s.charAt(i) == '0'){
                    zero++;
                } else { one++;}
            }
        }

        int answer = Math.min(one, zero);
        System.out.println(answer);
    }
}