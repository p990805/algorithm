package basic;

public class FindMaxPlusMultiply {

    static int find_max_plus_or_multiply(int[] arr){
        int len = arr.length;
        int sum =arr[0];

        for(int i =1; i< len; i++){
            int plusSum =0;
            int multiplySum =0;
            plusSum = sum + arr[i];
            System.out.println("plusSum = " + plusSum);
            multiplySum = sum * arr[i];
            System.out.println("multiplySum = " + multiplySum);
            if(plusSum >= multiplySum){
                sum = plusSum;
            } else {
                sum = multiplySum;
            }
            System.out.println("sum = " + sum);
        }

        return sum;
    }
    public static void main(String[] args) {

        System.out.println("정답 = 728 현재 풀이 값 = " + find_max_plus_or_multiply(new int[]{0,3,5,6,1,2,4}));
        System.out.println("정답 = 8820 현재 풀이 값 = " + find_max_plus_or_multiply(new int[]{3,2,1,5,9,7,4}));
        System.out.println("정답 = 270 현재 풀이 값 = " + find_max_plus_or_multiply(new int[]{1,1,1,3,3,2,5}));
    }
}
