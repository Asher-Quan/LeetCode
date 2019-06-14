/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null)
            return true;
        ListNode l = head;
        ListNode r = head;
        Stack<Integer> stack = new Stack();
        stack.push(l.val);
        while(r.next!=null && r.next.next != null){
            l = l.next;
            r = r.next.next;
            stack.push(l.val);
        }
        if(r.next == null)
            stack.pop();
        while(l.next!=null){
            l = l.next;
            if(stack.pop() != l.val)
                return false;
        }
        return true;
    }
}