package boj;

import java.io.*;
import java.util.*;

public class BOJ_10816 {
    static int N,M;
    static int[] cards;
    static int[] numbers;
    static HashMap<Integer, Integer> countNum = new HashMap<>();

    static int solution (int findNum, int[] cards) {
        int MinIndex = 0;
        int MaxIndex = cards.length -1;

        while (MinIndex <= MaxIndex) {
            int curIndex = (MinIndex  + MaxIndex) / 2;
            if(cards[curIndex] == findNum) {
                return countNum.getOrDefault(cards[curIndex],0);
            } else if (cards[curIndex] < findNum) {
                MinIndex = curIndex + 1;
            } else {
                MaxIndex = curIndex - 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        N = Integer.parseInt(br.readLine());
        cards = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int  i =0; i<N;i++){
            cards[i] = Integer.parseInt(st.nextToken());
            if(countNum.containsKey(cards[i])){
                countNum.put(cards[i], countNum.get(cards[i]) + 1);
            } else {
                countNum.put(cards[i],1);
            }
        }

        Arrays.sort(cards);

        M = Integer.parseInt(br.readLine());
        numbers = new int[M];

        st = new StringTokenizer(br.readLine());
        for(int i =0; i<M;i++){
            numbers[i] = Integer.parseInt(st.nextToken());
            int result = solution(numbers[i],cards);
            sb.append(result).append(" ");
        }
        System.out.println(sb.toString().trim());

    }
}