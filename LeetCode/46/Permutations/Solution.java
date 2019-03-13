import java.util.ArrayList;
import java.util.List;

/**
 * Solution
 */
class Solution {
    private List<List<Integer>> list = new ArrayList<>();
    private boolean[] flag;
    public void permute(int[]nums,int index,List<Integer> cur){
        if(index == nums.length){
           List<Integer> target = new ArrayList<>();
        	target.addAll(cur);
            list.add(target);
            return;
        }
        for(int i = 0 ; i < nums.length ; i++){
            if(!flag[i]){
            flag[i] = true;
            cur.add(nums[i]);
            permute(nums,index+1,cur);
            cur.remove(cur.size()-1);
            flag[i] = false;
            }
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> cur = new ArrayList<>();
        flag = new boolean[nums.length];
        for(int i = 0 ; i < nums.length ; i++)
            flag[i] = false;
        permute(nums,0,cur);
        return list;
    }
}