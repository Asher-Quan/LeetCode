/**
 * Solution
 */
public class Solution {
    public boolean backspaceCompare(String S, String T) {
        Stack<Character> s = new Stack();
        Stack<Character> t = new Stack();
        for(int i = 0 ; i < S.length() ; i++){
            if(S.charAt(i) == '#'){
                if(!s.empty()){
                    s.pop();
                }
            }
            else{
                s.push(S.charAt(i));
            }
        }
        for(int i = 0 ; i < T.length() ; i++){
            if(T.charAt(i) == '#'){
                if(!t.empty()){
                    t.pop();
                }
            }
            else{
                t.push(T.charAt(i));
            }
        }
        while(!s.empty() && !t.empty()){
            if(s.pop() != t.pop())
                return false;
        }
        if(s.empty() && t.empty())
            return true;
        else
            return false;
    }
}