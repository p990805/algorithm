package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SWEA_22574 {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            long n = Long.parseLong(st.nextToken());
            long p = Long.parseLong(st.nextToken());

            long maxF = n*(n+1) /2;
            if(maxF<p){
                sb.append(maxF+"\n");
                continue;
            }else if(maxF==p){
                sb.append((maxF-1)+"\n");
            } else if (maxF>p){
                for(long i =1; i<=n;i++){
                    long nextF = i*(i+1) /2;
                    if(nextF == p){
                        sb.append((maxF-1)+"\n");
                        break;
                    }
                    if(nextF>p){
                        sb.append(maxF+"\n");
                        break;
                    }
                }
            }

        }

        System.out.println(sb.toString().trim());
    }

}
