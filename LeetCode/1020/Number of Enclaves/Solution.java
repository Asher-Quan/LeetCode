class Solution {
    public int numEnclaves(int[][] A) {
        int count = 0;
        int[][] dp = new int[A.length][A[0].length];
        for(int i = 0 ; i < A.length ; i++)
            for(int j = 0 ; j < A[0].length ;j++){
                if(A[i][j] == 1){
                    if( i == 0 || j == 0 || i == A.length-1 || j == A[0].length-1){
                        count++;
                        dp[i][j] = 1;
                    }
                }
                else{
                    if(dp[i-1][j] == 1 || dp[i][j-1] == 1 || A[i+1][j] == 1 || A[i+1][j] == 1){
                        count++;
                        dp[i][j] = 1;
                    }   
                }
            }
    }
}