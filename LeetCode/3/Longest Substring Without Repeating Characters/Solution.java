/**
 * Solution
 */
public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int [] array = new int [128];
        int min = -1;
        int i = 0;
        int j = 0;
        int sum = 0;
        while(i < s.length()){
            if(j<s.length() && array[(int)(s.charAt(j))] == 0 ){
                array[(int)(s.charAt(j))] = 1;
                j++;
                sum++;
            }
            else{
                array[(int)(s.charAt(i))] = 0;
                i++;
                sum--;
            }
            min = Math.max(sum, min);
        }
         if (min == -1)
             return 0;
        return min;
    }
}