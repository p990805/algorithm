package codetree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class CodeTree_가장많은데이터 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Map<String,Integer> map = new HashMap<>();
        int max =0;

        while(n-- > 0) {
            String color = br.readLine();
            map.put(color,map.getOrDefault(color,0)+1);
            max = Math.max(max,map.get(color));
        }

        System.out.println(max);
    }

}
