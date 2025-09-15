package basic;

public class IsExistingTargetNumberBinary {
    static boolean isExistingTargetNumberBinary(int targetNumber, int[] binary) {
        int binaryMin = 0;
        int binaryMax = binary.length - 1;

        int targetCur = (binaryMax + binaryMin) / 2;
        int findCnt =0;
        boolean found = false;

        while ( binaryMin <= binaryMax ) {
            findCnt ++;
            if(binary[targetCur] == targetNumber) {
                found = true;
                System.out.println(findCnt);
                return found;
            } else if (binary[targetCur] > targetNumber) {
                binaryMax = targetCur - 1;
            } else {
                binaryMin = targetCur + 1;
            }
            targetCur = (binaryMax + binaryMin) / 2;
        }
        return found;
    }
    public static void main(String[] args) {
        int findingTarget = 14;
        int[] findingNumbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};

        boolean result = isExistingTargetNumberBinary(findingTarget, findingNumbers);
        System.out.println(result);
    }
}
