/**
 * Solution
 */
public class Solution {
    public static int minSubArrayLen(int s, int[] nums) {
       int i = 0;
       int j = 0;
       int min = nums.length+1;
       int sum = 0;
       while(i<nums.length){
            if(sum<s && j < nums.length )
                sum = sum + nums[j++];
            else
                sum = sum - nums[i++];
            if(sum>=s)
                min = Math.min(min, j-i);
       }
        if (min == nums.length+1)
            return 0;
        return min;
    }    
    public static void main(String[] args) {
        int [] a = {2,3,1,2,4,3};
        System.out.println(minSubArrayLen(7,a));
    }
}