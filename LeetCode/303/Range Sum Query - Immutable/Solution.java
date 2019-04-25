// class NumArray {

//     int [] nums;
//     public NumArray(int[] nums) {
//         this.nums = nums;
//     }
    
//     public int sumRange(int i, int j) {
//         int sum = 0;
//         while(i<=j){
//             sum = sum + nums[i];
//             i++;
//         }
//         return sum;
//     }
// }

// /**
//  * Your NumArray object will be instantiated and called as such:
//  * NumArray obj = new NumArray(nums);
//  * int param_1 = obj.sumRange(i,j);
//  */

class NumArray {

    int [] dp;
    int [] nums;
    public NumArray(int[] nums) {
        this.nums = nums;
        int [] dp = new int[nums.length];
        this.dp = dp;
        if(nums != null && nums.length != 0){
            dp[0] = 0;
            for(int i = 1; i < dp.length;i++){
            dp[i] = nums[i-1] + dp[i-1];
            }
        }
    }
    
    public int sumRange(int i, int j) {
        return dp[j] + nums[j] - dp[i];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(i,j);
 */