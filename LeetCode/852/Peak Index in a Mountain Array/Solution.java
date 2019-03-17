/**
 * Solution
 */
public class Solution {
    public int peakIndexInMountainArray(int[] A) {
        int i = 0 ;
        for(int j = 1 ; j<A.length ; j++){
            if(A[j] > A[i])
                i = j;
            else
                break;
        }
        return i;
    }
}