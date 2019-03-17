class Solution {
    public int search(int[] nums, int target) {
        int i = 0;
        int j = nums.length;
        int mid = (i+j)/2;
        boolean flag = false;
        while(i<j-1){
            if(nums[mid] > target)
                j = mid;
            else if(nums[mid] < target)
                i = mid;
            else if(nums[mid] == target){
                flag = true;
                break;
            }
            mid = (i+j)/2;
        }
        if(flag)
            return mid;
        else
            return -1;
    }
}