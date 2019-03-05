/**
 * Solution
 */
public class Solution {

    public int minCostClimbingStairs(int[] cost) {
        if(cost.length == 0)
            return 0;
        if(cost.length == 1)
            return cost[0];
        if(cost.length == 2)
            return Math.min(cost[0],cost[1]);
        int [] memo = new int[cost.length];
        memo[0] = cost[0]; memo[1] = cost[1];
        for(int i = 2; i < cost.length ; i++){
            if(i == cost.length-1)
                memo[i] = Math.min((memo[i-2]+cost[i]),memo[i-1]);
            else
                memo[i] = Math.min(memo[i-1],memo[i-2])+cost[i];
        } 
        return memo[cost.length-1];
    }
}