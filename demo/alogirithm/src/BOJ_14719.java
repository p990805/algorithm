import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;

public class BOJ_14719 {
    static int h,w;
    static int [] map;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        h = Integer.parseInt(st.nextToken());
        w = Integer.parseInt(st.nextToken());
        int answer =0;

        map = new int[w];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < w; i++) {
            map[i] = Integer.parseInt(st.nextToken());
        }

        for(int i =1; i<w-1;i++){
            int left =0, right =0;
            for(int j =0; j<i;j++){
                left = Math.max(left,map[j]);
            }
            for(int j =i+1;j<w;j++){
                right = Math.max(right,map[j]);
            }
            if(map[i] < left && map[i] < right){
                answer += Math.min(left, right) - map[i];
            }
        }
        System.out.println(answer);
    }
}
