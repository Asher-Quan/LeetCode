import java.util.HashSet;
import java.util.Set;

public class Solution {
	public static int removeDuplicates(int[] nums) {
        int length = 0;        
        for(int i = 1; i < nums.length; i++){
            if(nums[length] < nums[i]) 
                nums[++length] = nums[i];
        }
        return ++length;
    }
	public static void main(String[]args) {
		int [] a = {1,2,3,4,5};
		System.out.println(removeDuplicates(a));
	}
}
