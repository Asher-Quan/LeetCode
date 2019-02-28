import java.util.Arrays;

public class Solution {

	public void merge(int[] nums1, int m, int[] nums2, int n) {
		int[] cur = Arrays.copyOf(nums1,nums1.length);
		int i = 0;
		int j = 0;
		for(int k = 0 ; k<nums1.length ; k++) {
			if(i >= m)
				nums1[k] = nums2[j++];
			else if(j >= n)
				nums1[k] = cur[i++];
			else if(cur[i]<nums2[j])
				nums1[k] = cur[i++];
			else
				nums1[k] = nums2[j++];
		}
    }
}
