
public class Solution {
	public static int uniquePaths(int m, int n) {
		int memo[][] = new int [n][m];
		for(int i = 0; i < n; i++)
			for(int j = 0; j < m; j++) {
				if(i==0 && j==0)
					memo[i][j] = 1;
				else if(i == 0)
					memo[i][j] = 1;
				else if(j == 0)
					memo[i][j] = 1;
				else
					memo[i][j] = memo[i-1][j]+memo[i][j-1];
			}
		return memo[n-1][m-1];
    }
	public static void main(String[] args) {
		System.out.println(uniquePaths(3, 7));
	}
}
