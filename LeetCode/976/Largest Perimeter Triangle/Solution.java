class Solution {
    public int largestPerimeter(int[] A) {
        Arrays.sort(A);
        for (int i = A.length-3; i >= 0; i--) {
            if(A[i+2] < A[i+1] + A[i])
                return A[i]+A[i+1]+A[i+2];
        }
        return 0;
    }
}