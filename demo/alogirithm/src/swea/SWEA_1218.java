package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Set;

public class SWEA_1218 {
    static Set<Character> set;
    static void init(){
        set = new HashSet<>();
        set.add('(');
        set.add('{');
        set.add('[');
        set.add('<');
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = 10;
        for(int tc=1; tc<=T; tc++){
            init();
            int len = Integer.parseInt(br.readLine());
            char[] arr = br.readLine().toCharArray();

            Deque<Character> dq = new ArrayDeque<>();
            boolean flag = true;

            for(int i=0; i<len; i++){
                if(set.contains(arr[i])){
                    dq.addLast(arr[i]);
                } else {
                    switch(arr[i]){
                        case ')': {
                            char c = dq.peekLast();
                            if(c=='(') dq.pollLast();
                            else {
                                flag = false;
                                break;
                            };
                        } break;
                        case '}': {
                            char c = dq.peekLast();
                            if(c=='{') dq.pollLast();
                            else {
                                flag = false;
                                break;
                            };
                        }break;
                        case ']': {
                            char c = dq.peekLast();
                            if(c=='[') dq.pollLast();
                            else {
                                flag = false;
                                break;
                            };
                        }break;
                        case '>': {
                            char c = dq.peekLast();
                            if(c=='<') dq.pollLast();
                            else {
                                flag = false;
                                break;
                            };
                        }break;
                    }
                }

            }

            int answer = (flag) ? 1:0;
            sb.append("#").append(tc).append(" ").append(answer).append("\n");

        }
        System.out.println(sb.toString().trim());
    }
}
