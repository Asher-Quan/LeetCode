import java.util.Stack;

class Solution {
    public int minAddToMakeValid(String S) {
        Stack<Character> stack = new Stack<>();
        int i = 0;
        while(i < S.length()){
            char c = S.charAt(i);
            if(c == '(' || stack.isEmpty())
                stack.add(c);
            else if(stack.peek() == '(')
                stack.pop();
            else
                stack.add(c);
            i++;
        }
        return stack.size();
    }
}