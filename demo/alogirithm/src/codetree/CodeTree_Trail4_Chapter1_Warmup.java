package codetree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CodeTree_Trail4_Chapter1_Warmup {
    static int N;
    static int[][] grid;
    static int getSumOfGold(int rowS,int colS,int rowE, int colE) {
        int sum = 0;
        for(int row = rowS; row <= rowE; row++) {
            for(int col = colS; col <= colE; col++) {
                sum += grid[row][col];
            }
        }
        return sum;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        grid = new int[N][N];

        for(int i=0; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j =0; j<N; j++) {
                grid[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int max =0;

        for(int i=0; i<N;i++){
            for(int j=0; j<N;j++){
                if(i+2>=N || j+2>=N){
                    continue;
                }
                int sumOfGold = getSumOfGold(i,j,i+2,j+2);
                max = Math.max(max, sumOfGold);
            }
        }
        System.out.println(max);

    }

}
