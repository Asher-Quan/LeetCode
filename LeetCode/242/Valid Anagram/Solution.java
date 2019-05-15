class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
            return false;
        int [] a = new int[26];
        int [] b = new int[26];
        int i = 0;
        while(i<s.length()){
            a[s.charAt(i) - 'a']++;
            i++;
        }
        i = 0;
        while(i<s.length()){
            b[t.charAt(i) - 'a']++;
            i++;
        }
        i = 0;
        while(i < 26){
            if(a[i] != b[i])
                return false;
            i++;
        }
        return true;
    }
}