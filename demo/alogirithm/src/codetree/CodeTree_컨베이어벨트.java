package codetree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CodeTree_컨베이어벨트 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int t = Integer.parseInt(st.nextToken());

        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr1[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr2[i] = Integer.parseInt(st.nextToken());
        }

        while (t-- > 0) {
            int arr1Last = arr1[n-1];
            int arr2Last = arr2[n-1];


            for (int i = n-1; i > 0; i--) {
                arr1[i] = arr1[i-1];
            }
            arr1[0] = arr2Last;


            for (int i = n-1; i > 0; i--) {
                arr2[i] = arr2[i-1];
            }
            arr2[0] = arr1Last;
        }

        for (int i = 0; i < n; i++) {
            sb.append(arr1[i]).append(" ");
        }
        sb.append("\n");
        for (int i = 0; i < n; i++) {
            sb.append(arr2[i]).append(" ");
        }

        System.out.println(sb);
    }
}