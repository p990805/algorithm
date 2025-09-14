package codetree;

import java.util.*;
import java.io.*;
import static java.lang.Integer.*;


public class CodeTree_Trail2_Chapter4_Lesson4 {
    static int n;
    static int x1,y1,x2,y2;
    static final int max = 201;
    static int[][] arr = new int[max][max];
    static int colorValue =0;

    public static void fillColor(int x1,int y1,int x2, int y2){
        if(colorValue %2==0){
            for(int i = x1; i < x2; i++){
                for(int j = y1; j < y2; j++){
                    arr[i][j]=1;
                }
            }
        }else{
            for(int i = x1; i < x2; i++){
                for(int j = y1; j < y2; j++){
                    arr[i][j]=2;
                }
            }
        }

        colorValue = (colorValue+1)%2;

    }

    public static int checkBlue(){
        int cnt =0;
        for(int i = 0; i<max; i++){
            for(int j = 0; j<max; j++){
                if(arr[i][j]==2){
                    cnt++;
                }
            }
        }
        return cnt;
    }


    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = parseInt(br.readLine());


        for(int i =0; i<n;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            x1 = parseInt(st.nextToken())+100;
            y1 = parseInt(st.nextToken())+100;
            x2 = parseInt(st.nextToken())+100;
            y2 = parseInt(st.nextToken())+100;
           fillColor(x1,y1,x2,y2);
        }
        int answer=checkBlue();
        System.out.println(answer);

    }
}