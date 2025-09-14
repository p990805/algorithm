package boj;

import java.io.*;

import static java.lang.Integer.*;

public class BOJ_1436 {

    static int N;
    static boolean flag = false;
    static int cnt = 0;
    static int num=665;
    static void solution(int n){

        String a = String.valueOf(n);
        char[]b = a.toCharArray();
        for(int i =1; i<b.length-1; i++){
            if(b[i]=='6'){
                if(b[i-1]=='6' && b[i+1]=='6'){
                    cnt++;
                    if(cnt==N){
                        flag = true;
                        return;
                    }
                    return;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = parseInt(br.readLine());

        while(!flag) {
            num++;
            solution(num);

        }

        System.out.println(num);
    }
}
