package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SWEA_26009 {
    static final long MOD = 998244353L;

    static long sumMod(long a) {
        return (a * (a + 1) / 2) % MOD;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            long a = Long.parseLong(st.nextToken());
            long b = Long.parseLong(st.nextToken());
            long c = Long.parseLong(st.nextToken());

            long i = sumMod(a);
            long j = sumMod(b);
            long k = sumMod(c);


            long answer = i * j % MOD * k % MOD;
            sb.append(answer).append('\n');
        }

        System.out.print(sb);
    }
}