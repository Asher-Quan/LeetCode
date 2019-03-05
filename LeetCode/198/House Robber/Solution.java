/**
 * Solution
 */
public class Solution {

    public int rob(int[] nums) {
        if(nums.length == 0 )
            return 0;
        if(nums.length == 1 )
            return nums[0];
        if(nums.length == 2 )
            return Math.max(nums[0],nums[1]);
        int []memo = new int[nums.length];
        memo[0] = nums[0]; memo[1] = nums[1];
        if(memo[0] > memo[1] )
            memo[1] = memo[0];
        for(int i = 1; i <nums.length ; i++){
            memo[i] = Math.max((nums[i]+memo[i-2]),memo[i-1]);
        }
        return memo[nums.length-1];
    }
}