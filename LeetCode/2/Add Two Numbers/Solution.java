/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode rs = new ListNode(0);
        ListNode memo = rs;
        boolean flag = false;
        while(l1!=null && l2!=null){
            if(flag)
                l1.val = l1.val + 1;
            if(l1.val + l2.val >= 10){
                l1.val = l1.val - 10;
                flag = true;   
            }
            else
                flag = false;
            ListNode current = new ListNode((l1.val+l2.val));
            memo.next = current;
            memo = memo.next;
        
            l1 = l1.next;
            l2 = l2.next;
        }
        while(l1!=null){
            if(flag){
                l1.val = l1.val + 1;
                if(l1.val >= 10){
                   flag = true;
                    l1.val = l1.val - 10;
                }else
                    flag = false;
            }
            ListNode current = new ListNode((l1.val));
            memo.next = current;
            memo = memo.next;   
            l1 = l1.next;
        }
        while(l2!=null){
            if(flag){
                l2.val = l2.val + 1;
                if(l2.val >= 10){
                   flag = true;
                    l2.val = l2.val - 10;
                }else
                    flag = false;
            }
            ListNode current = new ListNode((l2.val));
            memo.next = current;
            memo = memo.next;
            l2 = l2.next;
        }
        if(flag)
            memo.next = new ListNode(1);
        return rs.next;
    }
}