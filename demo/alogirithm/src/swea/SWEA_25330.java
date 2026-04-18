package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SWEA_25330 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int tc = Integer.parseInt(br.readLine());

        while (tc-- > 0) {
            String num = br.readLine();
            String[]nums = num.split("");
            boolean flag = true;

            int[] indexs = new int[10];
            int[] counts = new int[10];
            Arrays.fill(indexs,-1);

            for(int i=0; i< nums.length;i++){
                int index = Integer.parseInt(nums[i]);
                counts[index]++;

                if(indexs[index] != -1){
                    if(counts[index] > 2) {
                        flag = false;
                        break;
                    } else {
                        if(i - indexs[index] != index+1) {
                            flag = false;
                            break;
                        }
                    }
                } else {
                    indexs[index]=i;
                }
            }

            for(int i =0; i< counts.length;i++){
                if(counts[i] ==1){
                    flag=false;
                    break;
                }
            }

            if(flag){
                sb.append("yes").append("\n");
            } else {
                sb.append("no").append("\n");
            }
        }

        System.out.println(sb.toString().trim());

    }

}
