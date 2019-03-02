import java.util.ArrayList;
import java.util.List;

/**
 * Solution
 */
public class Solution {

    public List<Integer> findAnagrams(String s, String p){
        List<Integer> res = new ArrayList<>();
        if(s.length() < p.length() )
            return res;
        int[] freeS = new int[26];
        int[] freeP = new int[26];
        for(int i = 0 ; i <s.length(); i++)
            freeP[i]++;
    }
    public static void main(String[] args) {
        String s = "cbaebabacd";
        String p = "abc";
        return 0 6;
    }
}