/**
 * Solution
 */
public class Solution {
    public int shipWithinDays(int[] weights, int D){
        int max = weights[0];
        for(int i = 0 ;i < weights.length; i++)
            max = Math.max(max, weights[i]);
        int [] ship;
        for(int i = max ; i <= weights.length*max;i++){
            ship = new int[D];
            int index = 0;
            for(int j = 0; j < ship.length ; j++){
               while(index < weights.length && ship[j] + weights[index] < i){
                   ship[j] = ship[j] + weights[index];
                   index++;
               }
            }
            if(index == weights.length) return i-1;
        }
        return 0;
    }
}