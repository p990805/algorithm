package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class BOJ_1764 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        List<String> names = new ArrayList<>();
        Map<String, Integer> map = new TreeMap<>();
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int sum = n+m;

        for(int i =0; i< sum; i++){
            String name = br.readLine();
            names.add(name);
        }

        for(String name : names){
            map.put(name, map.getOrDefault(name, 0) + 1);
        }

        int cnt =0;
        for(Map.Entry<String, Integer> entry : map.entrySet()) {
            if(entry.getValue() >=2) {
                sb.append(entry.getKey()).append("\n");
                cnt++;
            }
        }
        System.out.println(cnt);
        System.out.print(sb.toString().trim());
    }

}
