import java.io.*;
import java.util.*;

public class BOJ_2493_2 {
    static class Top {
        int height;
        int index;
        public Top(int height, int index) {
            this.height = height;
            this.index = index;
        }
    }
    static int N;
    static int[] tops;
    static StringBuilder sb  = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Top> stack = new Stack<>();

        N  =Integer.parseInt(br.readLine());
        tops = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            tops[i] = Integer.parseInt(st.nextToken());
            if(stack.isEmpty()) {
                stack.push(new Top(tops[i], i+1));
                sb.append(0).append(" ");
                continue;
            } else {
                while(true) {
                    if(stack.isEmpty()) {
                        stack.push(new Top(tops[i], i+1));
                        sb.append(0).append(" ");
                        break;
                    }
                    if(stack.peek().height < tops[i]) {
                        stack.pop();
                    } else {
                        sb.append(stack.peek().index).append(" ");
                        stack.push(new Top(tops[i], i+1));
                        break;
                    }
                }

            }

        }
        System.out.println(sb.toString().trim());


    }
}