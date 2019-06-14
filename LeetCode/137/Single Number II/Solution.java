class Solution {
    public int singleNumber(int[] nums) {
        int rs = 0;
        for (int i : nums) {
            rs = rs ^ i;
        }
        return rs;
    }
}