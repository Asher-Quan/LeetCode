/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null)
            return head;
        int i = head.val;
        ListNode l = head;
        ListNode r = head.next;
        while(r != null){
            if(r.val != i){
                i = r.val;
                l.next = r;
                l = l.next;
            }
            r = r.next;
        }
        l.next = null;
        return head;
    }
}