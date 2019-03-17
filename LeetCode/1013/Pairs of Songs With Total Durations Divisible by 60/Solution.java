class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        int []memo = new int[60];
        for (int i = 0; i < 60; i++) {
            memo[i] = 0;
        }
        int rs = 0;
        for(int i = 0 ; i < time.length ; i++){
            rs = rs + memo[(600-time[i])%60];
            memo[time[i]%60]++;
        }
        return rs;
    }
}