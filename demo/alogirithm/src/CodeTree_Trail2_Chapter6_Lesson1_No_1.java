import java.io.*;
import java.util.*;
import static java.lang.Integer.*;

public class CodeTree_Trail2_Chapter6_Lesson1_No_1 {
    static int n;

    static int[]arr;

    static int min = MAX_VALUE;

    static void check(int f){

        int cnt =0;
        for(int i=0;i<n;i++){
            cnt += arr[i] *(Math.abs(i-f));
        }
        if(cnt < min){
            min =cnt;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = parseInt(br.readLine());
        arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i =0; i<n;i++){
            arr[i] = parseInt(st.nextToken());
        }

        for(int i =0; i<n;i++){
            check(i);
        }

        System.out.println(min);

    }
}
