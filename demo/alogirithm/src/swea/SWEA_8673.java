package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class SWEA_8673 {
    static int square (int k, int n, int num) {
        if(k==n) return num;
        return square(k,n+1,num*2);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        for(int tc =1; tc<=T; tc++){
            Deque<Integer> dq = new ArrayDeque<>();

            sb.append("#").append(tc).append(" ");
            int k = Integer.parseInt(br.readLine());

            int players = square(k,1,2);
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int i =0; i<players; i++){
                dq.addLast(Integer.parseInt(st.nextToken()));
            }

            int sum = 0;

            while(dq.size() > 1) {
                int playerOne = dq.pollFirst();
                int playerTwo = dq.pollFirst();

                int max = Math.max(playerOne,playerTwo);
                int min = Math.min(playerOne,playerTwo);

                sum += max - min;

                dq.addLast(max);
            }

            sb.append(sum).append("\n");

        }
        System.out.println(sb);

    }

}
