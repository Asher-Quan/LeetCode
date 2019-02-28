
public class Solution {
	public static String longestPalindrome(String s) {
		if (s == null || s.length() == 0)
			return "";
		int memo[] = new int[s.length()];
		int max_index1 = 0;
		int max_index2 = 0;
		int max_value = 0;
		int i = 0;
		int j = 0;
		if(s.length()%2 == 0) {
			i = s.length()/2;
			j = i-1;
			memo[i-1] = 0;
		}
		else {
			i = s.length()/2+1;
			j = i-2;
			if(s.charAt(i) == s.charAt(j))
				memo[i-1] = 1;
			else if(s.charAt(i) == s.charAt(i-1))
				memo[++j] = 0;
			else if(s.charAt(j) == s.charAt(i-1))
				memo[--i] = 0;
		}
		for(;i<s.length()&&j>=0;i++,j--) {
			if(s.charAt(i) == s.charAt(j))
				memo[i] = memo[i-1] + 2;
			else
				memo[i] = memo[i-1];
			if (memo[i]>=max_value) {
				max_value = memo[i];
				max_index2 = i;
				max_index1 = j;
			}
		}
		if (max_value == 0)
			return s.substring(0, 1);
		else
			return s.substring(max_index1, max_index2+1);
    }
	public static void main(String[] args) {
		String s = "abb";
		System.out.println(longestPalindrome(s));
	}
}
