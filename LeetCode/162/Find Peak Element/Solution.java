class Solution {
    public int findPeakElement(int[] nums) {
        int i = 0 ;
        for(int j = 1 ; j<nums.length ; j++){
            if(nums[j] > nums[i])
                i = j;
            else
                break;
        }
        return i;
    }
}