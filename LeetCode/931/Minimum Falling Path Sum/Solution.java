class Solution {
    public int min(int a,int b,int c){
        return Math.min(Math.min(a,b),c);
    }
    public int minFallingPathSum(int[][] A) {
        if(A == null || A.length == 0)
            return 0;
        int [][] dp = new int[A.length][A[0].length];
        if(A == null || A.length == 0)
            return 0;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                if(i == 0)
                    dp[i][j] = A[i][j];
                else if( j == 0 )
                    dp[i][j] = Math.min(dp[i-1][j], dp[i-1][j+1])+A[i][j];
                else if (j == A[0].length-1)
                    dp[i][j] = Math.min(dp[i-1][j], dp[i-1][j-1])+A[i][j];
                else
                    dp[i][j] = min(dp[i-1][j-1],dp[i-1][j],dp[i-1][j+1])+A[i][j];
            }
        }
        int rs = Integer.MAX_VALUE;
        for (int i = 0; i < A[0].length; i++) {
            rs = Math.min(rs,A[A.length-1][i]);
        }
        return rs;
    }
}