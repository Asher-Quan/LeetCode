/**
 * Solution
 */
public class Solution {
    public int bitwiseComplement(int N) {
        StringBuilder s = new StringBuilder(Integer.toString(N,2));
        int i = 0;
        while(i<s.length()){
            if (s.charAt(i) == '0')
                s.setCharAt(i,'1');
            else
                s.setCharAt(i,'0');
            i++;
        }
        return Integer.parseInt(String.valueOf(s),2);
    }
}
public class Solution {
    public int bitwiseComplement(int N) {
        int i;
        for(i = 2 ; i <= N;i<<=1);
        return i-1-N;
    }
}