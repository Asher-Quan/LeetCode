
public class Solution {
	public int lengthOfLastWord(String s) {
	    return s.trim().length()-s.trim().lastIndexOf(" ")-1;
	}
	public static void main(String[] args) {
		
	}
}
