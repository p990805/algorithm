package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class BOJ_11866 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        sb.append("<");

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        Deque<Integer> dq = new ArrayDeque<>();

        for(int i =1; i<=n; i++){
            dq.addLast(i);
        }

        int cnt = 1;

        while(dq.size() != 1) {
            int tmp = dq.pollFirst();

            if(cnt % k == 0) {
                sb.append(tmp).append(", ");
            } else {
                dq.addLast(tmp);
            }
            cnt = (cnt+1)%k;
        }

        sb.append(dq.pollFirst()).append(">");
        System.out.println(sb.toString().trim());

    }

}
