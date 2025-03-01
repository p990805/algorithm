import java.io.*;
import java.util.*;
import static java.lang.Integer.*;

public class CodeTree_Trail4_Chapter1_Lesson3_Basic {
    static int n;
    static LinkedList<Integer> lst = new LinkedList<>();

    static void delete(int a , int b){
        for(int i = b; i >= a; i--){
            lst.remove(i-1);
        }
    }

    static void answer(){
        StringBuilder sb = new StringBuilder();
        sb.append(lst.size()).append("\n");
        for(int i =0; i<lst.size(); i++){
            sb.append(lst.get(i)).append("\n");
        }
        System.out.println(sb.toString().trim());
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = parseInt(br.readLine());

        for(int i =0; i<n;i++){
            int a = parseInt(br.readLine());
            lst.add(a);
        }

        for(int i =0; i<2;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = parseInt(st.nextToken());
            int b = parseInt(st.nextToken());
            delete(a,b);
        }

        answer();

    }
}