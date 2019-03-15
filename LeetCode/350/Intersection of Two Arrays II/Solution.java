import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

// class Solution {
//     public int[] intersect(int[] nums1, int[] nums2) {
//         int len = nums1.length > nums2.length ? nums2.length: nums1.length;
//         List<Integer> result = new ArrayList<>();
//         int i = 0;
//         int j = 0;
//         Arrays.sort(nums1);
//         Arrays.sort(nums2);
//         while(i < nums1.length && j < nums2.length){
//             if(nums1[i] == nums2[j]){
//                 result.add(nums1[i]);
//                 i++;
//                 j++;
//             }else if(nums1[i] > nums2[j]){
//                 j++;
//             }else{
//                 i++;
//             }
//         }
//       int [] rs = new int[result.size()];
//       int k = 0;
//       for (Integer r : result) {
//           rs[k] = r;
//           k++;
//       }
//       return rs;
//     }
// }

/**
 * Solution
 */
public class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i < nums1.length ; i++){
            if(map.containsKey(nums1[i]))
                map.put(nums1[i],map.get(nums1[i])+1);
            else
                map.put(nums1[i],1);
        }
        for(int i = 0 ; i < nums2.length ; i++){
            if(map.containsKey(nums2[i]) && map.get(nums2[i]) > 0 ){
                list.add(nums2[i]);
                map.put(nums2[i],map.get(nums2[i])-1);
            }
        }
        int [] result = new int[list.size()];
        int k = 0;
        for (Integer var : list) {
            result[k++] = var;
        }
        return result;
    }
    
}