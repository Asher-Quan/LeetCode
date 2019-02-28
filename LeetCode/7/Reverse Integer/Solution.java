
public class Solution {
	public static int reverse(int x) {
		int result = 0;
		while(x!=0) {
			if(result>Integer.MAX_VALUE/10||result<Integer.MIN_VALUE/10) {
				return 0;
			}
			result = result*10 + x%10;
			x = x/10;
		}
		return result;
	}
	public static void main(String[] args) {
		int a = reverse(1534236469);
		System.out.println(a);
	}
}
