class Solution {
    public int repeatedNTimes(int[] A) {
        int N = A.length/2;
        int result = 0;
        int []memo = new int[10001];
        for(int i = 0 ;i<A.length;i++)
            memo[A[i]]++;
        for(int i = 0 ; i < 10001; i++)
            if(memo[i] == N){
                result = i;
                break;
            }
        return result;
    }
}