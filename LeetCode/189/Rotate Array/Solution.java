import java.util.Arrays;

public class Solution {
    public void rotate(int[] nums, int k) {
        int[] arr2 = Arrays.copyOf(nums, nums.length);
        int len = nums.length;
        for(int i = 0 ; i < arr2.length ;i++) {
        	nums[(i+k)%len] = arr2[i];
        }
    }
}
