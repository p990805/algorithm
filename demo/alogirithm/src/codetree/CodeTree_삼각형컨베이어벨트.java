package codetree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CodeTree_삼각형컨베이어벨트 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int t = Integer.parseInt(st.nextToken());

        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        int[] arr3 = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr1[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr2[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr3[i] = Integer.parseInt(st.nextToken());
        }

        while (t-- > 0) {
            int moveFirstNum = arr1[n - 1];
            int moveSecondNum = arr2[n - 1];
            int moveThirdNum = arr3[n - 1];

            for (int i = n - 1; i >= 1; i--) {
                arr1[i] = arr1[i - 1];
                arr2[i] = arr2[i - 1];
                arr3[i] = arr3[i - 1];
            }
            arr1[0] = moveThirdNum;
            arr2[0] = moveFirstNum;
            arr3[0] = moveSecondNum;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(arr1[i]).append(" ");
        }
        sb.append("\n");
        for (int i = 0; i < n; i++) {
            sb.append(arr2[i]).append(" ");
        }
        sb.append("\n");
        for (int i = 0; i < n; i++) {
            sb.append(arr3[i]).append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}