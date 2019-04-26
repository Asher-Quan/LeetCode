/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {  
        if(head == null || head.next == null)
            return head;
        ListNode r = head.next;
        ListNode mid = head;
        ListNode l = null;
        while(r.next != null){
            mid.next = l;
            l = mid;
            mid = r;
            r = r.next;
        }
        mid.next = l;
        r.next =mid;
        return r;
    }
}