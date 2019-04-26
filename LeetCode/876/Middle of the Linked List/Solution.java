/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode l = head;
        ListNode r = head;
        while(r.next != null && r.next.next != null){
            l = l.next;
            r = r.next.next;
        }
        if(r.next == null)
            return l;
        else
            return l.next;
    }
}