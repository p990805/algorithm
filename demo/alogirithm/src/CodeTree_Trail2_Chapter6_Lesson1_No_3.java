import java.io.*;
import java.util.*;
import static java.lang.Integer.*;

public class CodeTree_Trail2_Chapter6_Lesson1_No_3 {
    static int n;
    static int[]arr;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = parseInt(br.readLine());
        arr =new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i =0; i< n;i++){
            arr[i] =parseInt(st.nextToken());
        }
        int cnt =0;

        for(int i =0; i<n-2;i++){
            for(int j=i+1;j<n-1;j++){
                for(int k=j+1;k<n;k++){
                    if(arr[i]<=arr[j] && arr[j] <= arr[k]){
                        cnt++;
                    }
                }
            }
        }
        System.out.println(cnt);
    }
}
