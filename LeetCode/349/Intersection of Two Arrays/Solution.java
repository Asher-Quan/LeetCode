import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Solution
 */
public class Solution {
    public static int[] intersection(int[] nums1, int[] nums2) {
            Set<Integer> set = new HashSet<>();
            Set<Integer> set2 = new HashSet<>();
            List<Integer> list = new ArrayList<>();

            for(int i = 0 ; i<nums1.length ; i++){
                set.add(nums1[i]);
            }

            for(int i = 0 ; i<nums2.length ; i++){
                if(set.contains(nums2[i]) && !set2.contains(nums2[i])){
                    set2.add(nums2[i]);
                    list.add(nums2[i]);
                }
            }

            int [] array = new int[list.size()];
            for(int i = 0 ; i < array.length ; i++)
                array[i] =list.get(i);
                
            return array;
        }   
        public static void main(String[] args) {
            int [] nums1 = {1,2,2,1};
            int [] nums2 = {2,2};
            int [] nums3 = intersection(nums1, nums2);
            for(int i = 0; i<nums3.length; i++){
                System.out.println(nums3[i]);
            }
        }
}