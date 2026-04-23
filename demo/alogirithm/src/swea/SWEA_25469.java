package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SWEA_25469 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int h = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());

            char[][] arr = new char[h][w];
            for(int i = 0; i < h; i++) {
                String line = br.readLine();
                for(int j = 0; j < w; j++) {
                    arr[i][j] = line.charAt(j);
                }
            }
            int rows = 0;
            int cols = 0;

            for(int i =0; i< h; i++){
                boolean all = true;
                for(int j = 0; j< w; j++){
                    if(arr[i][j] != '#') {
                        all = false;
                        break;
                    }
                }
                if(all) rows++;
            }

            for(int j=0; j<w; j++){
                boolean all = true;
                for(int i=0; i<h; i++){
                    if(arr[i][j] != '#') {
                        all = false;
                        break;
                    }
                }
                if(all) cols++;
            }

            int ans;
            if(rows == h){
                ans = Math.min(h,w);
            } else {
                ans = rows+cols;
            }

            sb.append(ans).append("\n");
        }
        System.out.println(sb.toString().trim());
    }
}