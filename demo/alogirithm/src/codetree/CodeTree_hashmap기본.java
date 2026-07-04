package codetree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class CodeTree_hashmap기본 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        Map<Integer,String> map = new HashMap<>();

        while(n-- >0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            switch(command) {
                case "add" :{
                    int key = Integer.parseInt(st.nextToken());
                    String value = st.nextToken();
                    map.put(key, value);
                    break;
                }
                case "find": {
                    int key = Integer.parseInt(st.nextToken());
                    String value = map.getOrDefault(key,"None");
                    sb.append(value).append("\n");
                    break;
                }
                case "remove": {
                    int key = Integer.parseInt(st.nextToken());
                    map.remove(key);
                    break;
                }
            }
        }
        System.out.println(sb.toString().trim());

    }

}
