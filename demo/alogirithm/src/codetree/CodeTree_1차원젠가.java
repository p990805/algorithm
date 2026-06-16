package codetree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CodeTree_1차원젠가 {
    static int[] blocks;

    static void solution(int start, int end){
        int[] tmp = new int[blocks.length - (end-start+1)];
        int index = 0;

        for(int i=0; i<blocks.length; i++){
            if(i>=start && i<=end){
                continue;
            }
            tmp[index++] = blocks[i];
        }
        blocks = tmp;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int blockSize = Integer.parseInt(br.readLine());

        blocks = new int[blockSize];
        for (int i = 0; i < blockSize; i++) {
            blocks[i] = Integer.parseInt(br.readLine());
        }

        for(int time=0; time<2; time++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken())-1;
            int end = Integer.parseInt(st.nextToken())-1;
            solution(start,end);
        }

        StringBuilder sb = new StringBuilder();
        int len = blocks.length;
        sb.append(blocks.length).append("\n");
        for(int i=0; i<len; i++){
            sb.append(blocks[i]).append("\n");
        }
        System.out.println(sb.toString().trim());

    }

}
