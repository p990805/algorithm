package codetree;

import java.io.*;

public class CodeTree_Trail2_Chapter6_Lesson1_No_2 {
    static char[]arr;

    static int cnt;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();

        arr = new char[a.length()];

        for(int i =0; i<a.length();i++){
            arr[i] = a.charAt(i);
        }

        for(int i =0; i<arr.length;i++){
            if (arr[i]=='('){
                for(int j=i+1;j<arr.length;j++){
                    if(arr[j]==')'){
                        cnt++;
                    }
                }
            }
        }
        System.out.println(cnt);
    }
}
