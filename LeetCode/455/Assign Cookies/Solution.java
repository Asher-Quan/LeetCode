/**
 * Solution
 */
public class Solution {
    public int findContentChildren(int[] g, int[] s) {
        if(s.length == 0 || g.length == 0)
            return 0;
        Arrays.sort(g);
        Arrays.sort(s);
        int j = s.length-1;
        int count = 0;
        for(int i = g.length-1 ; i >= 0 && j >= 0; i--){
            if(s[j] >= g[i]){
                j--;
                count++;
            }
        }
        return count;
    }
}