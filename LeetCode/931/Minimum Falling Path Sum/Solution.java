class Solution {
    public int minFallingPathSum(int[][] A) {
        int [][] dp = new int[A.length][A[0].length];
        if(A == null || A.length == 0)
            return 0;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                if(i == 0)
                    dp[i][j] = A[i][j];
                dp[i][j] = Math.min(dp[i-1][j], dp[i-1][j+1]);
            }
        }
    }
}