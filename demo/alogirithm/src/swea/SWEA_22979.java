package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class SWEA_22979 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Deque<Character> dq ;
        StringBuilder sb = new StringBuilder();

        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            String str = br.readLine();
            dq = new ArrayDeque<>();
            for(int i = 0; i < str.length(); i++) {
                dq.addLast(str.charAt(i));
            }

            int n = Integer.parseInt(br.readLine());

            String[] arr = br.readLine().split(" ");
            for(int i=0; i<n; i++){

                int x = Integer.parseInt(arr[i]) % dq.size();

                if(x>0){
                    for(int j=0; j< x; j++){
                        char tmp = dq.pollFirst();
                        dq.addLast(tmp);
                    }
                } else if(x<0){
                    for(int j=0; j<Math.abs(x); j++){
                        char tmp = dq.pollLast();
                        dq.addFirst(tmp);
                    }
                } else continue;
            }

            int size = dq.size();

            for(int i=0; i<size; i++){
                sb.append(dq.pollFirst());
            }
            sb.append('\n');
        }
        System.out.println(sb);

    }

}
