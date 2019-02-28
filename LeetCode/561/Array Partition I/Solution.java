import java.util.Arrays;

public class Solution {
	
	public static int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for(int i =0;i<nums.length;i=i+2) {
        	sum = nums[i] + sum;
        }
        return sum;
    }
	public static void main(String[] args) {
		int []a = {1,4,3,2};
		int s = arrayPairSum(a);
		System.out.println(s);
	}
}
