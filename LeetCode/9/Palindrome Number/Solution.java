
public class Solution {
	 public static boolean isPalindrome(int x) {
		 	int res = x;
		 	int result = 0;
	        if(x==0) {
	        	return true;
	        }else if(x<0||x%10==0) {
	        	return false;
	        }
	        while(x!=0) {
	        	result = result*10 + x%10;
	        	x=x/10;
	        }
	        if(res==result) {
	        	return true;
	        }
	        return false;
	    }
	 public static void main(String[] args) {
		boolean is = isPalindrome(0);
		System.out.println(is);
	}
}
