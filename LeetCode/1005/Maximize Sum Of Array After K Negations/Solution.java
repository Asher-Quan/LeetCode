import java.util.Arrays;

class Solution {
    public int largestSumAfterKNegations(int[] A, int K) {
        Arrays.sort(A);
        int sum = 0;
        for(int i = 0; i < K ; i++){
            sum = sum - A[i];
            if(A[i] == 0){
                K = i+1;
                break;
            }
        }
        for(int i = K ; i < A.length; i++){
            sum = sum + A[i];
        }
        return sum;
    }
}