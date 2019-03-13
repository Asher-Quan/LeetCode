import java.util.ArrayList;

/**
 * Solution
 */
public class Solution {
    private Boolean[] flag;
    private List<String> list;
    public void BackTrace(int index,String S,String cur){
        if(cur.length() == S.length()){
            list.add(cur);
            return;
        }
        for(int i = 0 ; i < S.length(); i++){
            if(flag[i] == false){
                flag[i] = true;
                
            }
        }
        return ;
    }
    public List<String> letterCasePermutation(String S) {
        for(int i = 0 ; i < flag.length ; i ++)
            flag[i] = false;
        String cur="";
        BackTrace(0,S,cur);
        return list;
    }
}