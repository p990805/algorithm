package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class SWEA_1221 {
    static class Num {
        String str;
        int num;

        public Num(String str, int num) {
            this.str = str;
            this.num = num;
        }
    }

    static Map<String,Integer> map = new HashMap<>();

    static void init(){
        map.put("ZRO",0);
        map.put("ONE",1);
        map.put("TWO",2);
        map.put("THR",3);
        map.put("FOR",4);
        map.put("FIV",5);
        map.put("SIX",6);
        map.put("SVN",7);
        map.put("EGT",8);
        map.put("NIN",9);
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        init();
        for(int tc=1; tc<=T; tc++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String testCase = st.nextToken();
            int caseCount = Integer.parseInt(st.nextToken());
            List<Num> lst = new ArrayList<>();

            st = new StringTokenizer(br.readLine());
            for(int i=0; i<caseCount; i++){
                String num = st.nextToken();
                int realNum = map.get(num);
                Num tmpNum = new Num(num, realNum);
                lst.add(tmpNum);
            }

            Collections.sort(lst,(a,b) -> a.num - b.num);
            sb.append(testCase+"\n");
            for(int i=0; i<lst.size(); i++){
                sb.append(lst.get(i).str).append(" ");
            }
            sb.append("\n");
        }
        System.out.println(sb.toString().trim());
    }
}
