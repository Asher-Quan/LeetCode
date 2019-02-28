
public class Solution {
//	public static int maxArea(int[] height) {
//		int max_value = 0;
//		for(int i=1;i<=height.length;i++) {
//			for(int j=i+1;j<=height.length;j++) {
//				max_value = Math.max(max_value,Math.min(height[i-1], height[j-1])*(j-i));
//			}
//		}
//		return max_value;
//    }
	
	public static int maxArea(int[] height) {
		int max_value = 0;
		int start = 0;
		int end = height.length-1;
		while(end>start) {
			int a = height[start];
			int b = height [end];
			max_value = Math.max(max_value,Math.min(a, b)*(end-start));
			if(a>b) {
				end--;
			}else {
				start++;
			}
		}
		return max_value;
    }
	
	public static void main(String[] args) {
		int [] height = {1,8,6,2,5,4,8,3,7};
		System.out.println(maxArea(height));
	}
}
