/**
 * Solution
 */
public class Solution {
    public boolean isSubsequence(String s, String t) {
        if(t.length() == 0 && s.length() != 0)
            return false;
        if(s.length() == 0)
            return true;
        int i = 0;
        int j = 0;
        while(j<t.length() && i<s.length()){
            if(s.charAt(i) == t.charAt(j)){
                i++;
                j++;
            }
            else{
                j++;
            }
        }
        if(i == s.length())
            return true;
        return false;
    }
}