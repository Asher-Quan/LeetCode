
public class Solution {

	public static void moveZeroes(int[] nums) {
		int result = 0;
		for(int i=0;i<nums.length;i++) {
			if(nums[i] != 0) {
				nums[result++]=nums[i];
			}
		}
		for(int i=result;i<nums.length;i++) {
			nums[i] = 0;
		}
		
		for(int i=0;i<nums.length;i++) {
			System.out.println(nums[i]);
		}
    }
	
	public static void main(String[] args) {
		int [] a = {0,1,0,3,12};
		moveZeroes(a);
	}
}
