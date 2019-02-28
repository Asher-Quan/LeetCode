import java.util.ArrayList;
import java.util.List;

public class Solution {
	public List<List<Integer>> generate(int numRows) {
		List<List<Integer>> list = new ArrayList<>();
        if(numRows == 0)
        	return null;
        int [][]nums = new int[numRows][];
        for(int i = 0 ; i< numRows ; i++) {
        	List<Integer> row = new ArrayList<>();
        	for(int j = 0 ; j < i+1 ; j++) {
        		if( j == 0 || j == i) {
        			nums[i][j] = 1;
        			row.add(nums[i][j]);
        		}
        		else {
        			nums[i][j] = nums[i-1][j] + nums[i-1][j-1];
        			row.add(nums[i][j]);
        		}
        	}
        	list.add(row);
        }
        return list;
    }
}
