package codetree;

import java.io.*;
import java.util.*;
import static java.lang.Integer.*;


public class CodeTree_Trail4_Chapter2_Lesson4_Practice1 {
    static int n;
    static ArrayList<Integer> arr = new ArrayList<>();
    static boolean[] visited;

    static void printAnswer(){
        for(int i =0; i<arr.size(); i++){
            System.out.print(arr.get(i)+" ");
        }
        System.out.println();
    }

    static void backTracking(int currNum){
        if(currNum == n+1){
            printAnswer();
            return;
        }

        for(int i = n; i>0;i--){
            if(visited[i]) {
                continue;
            }
                visited[i] = true;
                arr.add(i);
                backTracking(currNum+1);
                arr.remove(arr.size()-1);
                visited[i] = false;

        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = parseInt(br.readLine());
        visited = new boolean[n+1];

        backTracking(1);
    }
}
