import java.util.Stack;

public class Solution {
	public static boolean isValid(String s) {
		Stack<Character> stack = new Stack<>();
		for (int i = 0 ;i < s.length() ; i++) {
			if(s.charAt(i) == ')' && !stack.empty() && stack.peek() == '('){
				stack.pop();
			}else if(s.charAt(i) == ']' && !stack.empty() && stack.peek() == '['){
				stack.pop();
			}else if(s.charAt(i) == '}' && !stack.empty() && stack.peek() == '{'){
				stack.pop();
			}else{
				stack.push(s.charAt(i));
			}
		}
		if(stack.empty())
			return true;
		else
		 	return false;
    }
}
