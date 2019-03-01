/**
 * Solution
 */
public class Solution {
    public boolean backspaceCompare(String S, String T) {
        if(S.length()==0 && T.length()==0)
            return true;
        else if(S.length() == 0 || T.length() == 0)
            return false;
        int i = S.length()-1;
        int j = T.length()-1;
        while(true){
            if(i<0 || j<0)
                break;
            else if(T.charAt(j) == '#' && j-2 >= 0)
                j = j - 2;
            else if(S.charAt(i) == '#' && i-2 >= 0)
                i = i - 2;
            else if(S.charAt(i) == T.charAt(j)){
                i--;
                j--;
            }
            else
                return false;
        }
    }
}