public class Solution {
    public  int minPathSum(int[][] grid) {
        if(grid.length == 0 || grid == null)
            return 0;
        
        int row = grid.length;
        int col = grid[0].length;
        
        int sum[][] = new int [row][col];
        for(int i=0;i<row;i++)
            for(int j=0;j<col;j++){
                if(i==0 && j == 0)
                    sum[i][j] = grid[i][j];
                else if(i==0)
                    sum[i][j] = sum[i][j-1] + grid[i][j];
                else if(j==0)
                    sum[i][j] = sum[i-1][j] + grid[i][j];
                else
                    sum[i][j] = Math.min(sum[i-1][j],sum[i][j-1])+grid[i][j];
            }
        return sum[row-1][col-1];
    }
    
}