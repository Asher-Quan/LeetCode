
public class Solution {
	public int uniquePathsWithObstacles(int[][] obstacleGrid) {
		int n = obstacleGrid.length;
		int m = obstacleGrid[0].length;
		boolean flagx = true;
		boolean flagy = true;
		int memo[][] = new int [n][m];
		for(int i = 0; i < n; i++)
			for(int j = 0; j < m; j++) {
				if(i==0 && j==0 && obstacleGrid[i][j] == 0)
					memo[i][j] = 1;
				else if(i == 0 && obstacleGrid[i][j] == 0 && obstacleGrid[i][j-1] == 0 && flagx)
					memo[i][j] = 1;
				else if(j == 0 && obstacleGrid[i][j] == 0 && obstacleGrid[i-1][j] == 0 && flagy)
					memo[i][j] = 1;
				else if(obstacleGrid[i][j] == 1)
					memo[i][j] = 0;
				else if(i>=1 && j>=1)
					memo[i][j] = memo[i-1][j]+memo[i][j-1];
				else if(i == 0)
					flagx = false;
				else if(j == 0)
					flagy = false;
				else
					memo[i][j] = 0;
			}
		return memo[n-1][m-1];
    }
}
