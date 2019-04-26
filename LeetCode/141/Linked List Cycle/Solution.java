/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
// public class Solution {
//     public boolean hasCycle(ListNode head) {
//         Set<ListNode> set = new HashSet<>();
//         while(head != null){
//             if(set.contains(head))
//                 return true;
//             else
//                 set.add(head);
//             head = head.next;
//         }
//         return false;
//     }
// }
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null)
            return false;
        ListNode l = head;
        ListNode r = head.next;
        while(l != r){
            if(r == null || r.next == null)
                return false;
            l = l.next;
            r = r.next.next;
        }
        return true;
    }
}