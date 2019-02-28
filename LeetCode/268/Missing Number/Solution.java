import java.util.stream.IntStream;

public class Solution {
//	public int missingNumber(int[] nums) {
//        Arrays.sort(nums);
//        int result=nums.length;
//        for(int i=0;i<nums.length;i++) {
//        	if(nums[i]!=i) {
//        		result = i;
//        		break;
//        	}
//        }
//        return result;
//        
//    }
	
	public int missingNumber(int[] nums) {
	    long n = nums.length;
	    return (int) (n * (n+1) / 2 - IntStream.of(nums).sum());
	}
	
	
	
	public static void main(String[] args) {
		;
	}
}
