
public class Solution {

	public static int maxSubArray(int[] nums) {
		int cur = nums[0];
		int result=nums[0];
		for(int i=1;i<nums.length;i++) {
			cur = Math.max(nums[i]+cur,nums[i]);
			result = Math.max(cur, result);
		}
		return result;
    }
	public static void main(String[] args) {
		int [] a = {1,2};
		System.out.println(maxSubArray(a));
	}
}
