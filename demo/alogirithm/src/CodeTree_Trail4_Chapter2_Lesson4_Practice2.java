import java.io.*;
import java.util.*;
import static java.lang.Integer.*;

public class CodeTree_Trail4_Chapter2_Lesson4_Practice2 {
    static int n;
    static int[][] arr;
    static boolean[] visited;
    static int max=0;
    static ArrayList<Integer>tmp = new ArrayList<>();

    static void backTrackint(int currNum){
        if(currNum == n){
            int sum =0;
            for(int i =0; i<tmp.size(); i++){
                sum += arr[i][tmp.get(i)];
            }
            max = Math.max(max,sum);
            return;

        }

        for(int i=0; i<n;i++){
            if(visited[i]){
                continue;
            }
            visited[i] = true;
            tmp.add(i);
            backTrackint(currNum+1);
            tmp.remove(tmp.size()-1);
            visited[i] = false;

        }
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = parseInt(br.readLine());
        arr = new int[n][n];

        visited = new boolean[n];

        for(int i =0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0; j<n; j++){
                arr[i][j] = parseInt(st.nextToken());
            }
        }

        backTrackint(0);
        System.out.println(max);
    }
}
