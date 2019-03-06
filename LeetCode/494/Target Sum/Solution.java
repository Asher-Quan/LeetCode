/**
 * Solution
 */
public class Solution {

    public int findTargetSumWays(int[] nums, int S) {
        if(nums.length == 0)
            return 0;
        if(nums.length == 1 && nums[0] == S)
            return 1;
        if(nums.length == 1 && nums[0] != S)
            return 0;
        int current = 0;
        int index = 0;
        int count = 0;
        return findTargetSumWays(nums, S, current, index,count);
        }
    public int findTargetSumWays(int[] nums, int S,int current,int index,int count) {
        
        if(index == nums.length && current == S)
            count++;
        else{

        }
        }   
    }
}