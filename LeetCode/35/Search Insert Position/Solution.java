import java.util.HashMap;

public class Solution {
	public static int searchInsert(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++) {
        	map.put(nums[i], i);
        }
        if(!map.containsKey(target)){
        	for(int i=target-1;i>0;i--) {
        		if(map.containsKey(i)) {
        			return map.get(i)+1;
        		}
        	}
        }
        return map.get(target);
    }
	public static void main(String[] args) {
		int a[] = {3,6,7,8,10};
		System.out.println(searchInsert(a, 5));
	}
}
