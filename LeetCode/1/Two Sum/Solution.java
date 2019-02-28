import java.util.HashMap;

public class Solution {
	public static int[] twoSum(int[] nums, int target) {
    	int [] result = new int [2];
    	HashMap<Integer, Integer> map = new HashMap<>();
    	for(int i=0;i<nums.length;i++) {
    		map.put(nums[i], i);
    	}
    	for(int i=0;i<nums.length;i++) {
    		if(map.containsKey((target-nums[i]))&&map.get((target-nums[i]))!=i) {
    			result[0] = i;
    			result[1] = map.get((target-nums[i]));
    			return result;
    		}
    	}
    	return result;
    }
    public static void main(String[] args){
    	int [] a = {3,2,4};
    	int [] b = twoSum(a,6);
    	System.out.println(b[0]);
    	System.out.println(b[1]);
    }
}