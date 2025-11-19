package boj;

import java.io.*;
import java.util.*;

public class BOJ_10811 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int temp =0;

        int[] basket = new int[n];
        for(int i=0;i<n;i++){
            basket[i]= i+1;
        }

        for(int i =0; i<m;i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken())-1;
            int b = Integer.parseInt(st.nextToken())-1;
            while(a<b){
                temp = basket[a];
                basket[a]=basket[b];
                basket[b]=temp;
                a++;
                b--;
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(basket[i]+" ");
        }

    }
}