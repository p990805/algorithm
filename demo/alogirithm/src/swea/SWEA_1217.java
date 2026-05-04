package swea;

import java.util.Scanner;

public class SWEA_1217 {
    static int solution(int n, int m, int count, int answer){
        if(count == m){
            return answer;
        }
        return solution(n,m,count+1,answer*n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T =10;

        for(int i=0;i<T;++i){
            int tc = sc.nextInt();
            int n = sc.nextInt();
            int m = sc.nextInt();

            int num = solution(n,m,1,n);
            String answer = "#"+tc+" "+num;
            System.out.println(answer);
        }
    }

}
