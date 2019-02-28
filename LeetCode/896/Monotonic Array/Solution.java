/**
 * Solution
 */
public class Solution {
    public boolean isMonotonic(int[] A) {
       int desc = 0;
       int incr = 0;
       for(int i =0;i<A.length-1;i++){
           if(A[i]<A[i+1]) incr++;
           if(A[i]>A[i+1]) desc++;
       }
       if(incr != 0 && desc != 0)
            return false;
       return true;
    }
}