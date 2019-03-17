class Solution {
    public int arrangeCoins(int n) {
        int i = 1;
        int rs = 0;
        long sum = 1;
        while(sum<= n){
            rs++;
            i++;
            sum = sum + i;
        }
        return rs;
    }
}