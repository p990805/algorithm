package codetree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class CodeTree_대응되는수와문자 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        String[]arr = new String[n+1];
        Map<String,String> map = new HashMap<>();

        for(int i=1; i<=n; i++) {
            arr[i] = br.readLine();
            String c = String.valueOf(i);
            map.put(arr[i], c);
            map.put(c, arr[i]);
        }

        for(int i=0; i<m;i ++){
            String key = br.readLine();
            String val = map.get(key);

            sb.append(val).append("\n");
        }
        System.out.println(sb.toString().trim());

    }

}
