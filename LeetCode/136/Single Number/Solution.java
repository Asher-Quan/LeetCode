class Solution {
    public int singleNumber(int[] nums) {
        int rs = 1; 
        for(int i = 0 ; i < nums.length ; i ++){
            rs = rs ^ nums[i];
        }
        return rs;
    }
}