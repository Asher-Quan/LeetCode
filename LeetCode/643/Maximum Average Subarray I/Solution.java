class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        for(int i = 0 ; i < nums.length;i++){
            sum = sum + nums[i];
            nums[i] = sum;
        }
        if(nums.length < k)
            return nums[nums.length-1]*1.0 / k;
        int rs = nums[k-1];
        int i = k;
        while(i < nums.length){
            if((nums[i] - nums[i-k]) > rs){
                rs = nums[i] - nums[i-k];
            }
            i++;
        }
        return rs*1.0/k;
    }
}