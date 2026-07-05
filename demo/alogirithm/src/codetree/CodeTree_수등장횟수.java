package codetree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class CodeTree_수등장횟수 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<n;i++){
            int a = Integer.parseInt(st.nextToken());
            map.put(a,map.getOrDefault(a,0)+1);
        }

        StringBuilder sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<m; i++) {
            int a = Integer.parseInt(st.nextToken());

            int answer = map.getOrDefault(a,0);
            sb.append(answer).append(" ");
        }
        System.out.println(sb.toString().trim());
    }

}
