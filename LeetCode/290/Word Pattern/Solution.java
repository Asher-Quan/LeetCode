import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean wordPattern(String pattern, String str) {
        Map<Character,Integer> map1 = new HashMap<>();
        Map<String,Integer> map2 = new HashMap<>();
        String [] s = str.split(" ");
        if(s.length != pattern.length())
            return false;
        for(int i = 0 ; i < pattern.length() ; i++){
            if(!map1.containsKey(pattern.charAt(i))){
                map1.put(pattern.charAt(i), i);
                if(map2.containsKey(s[i]))
                    return false;
                map2.put(s[i], i);
            }else {
                int j = map1.get(pattern.charAt(i));
                if(!map2.containsKey(s[i]))
                    return false;
                int k = map2.get(s[i]);
                if(j != k)
                    return false;
            }
        }
        return true;
    }
}