/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        if(headA ==null || headB == null)
            return null;
        int len_A = 0;
        int len_B = 0;

        ListNode a = headA;
        ListNode b = headB;
        while(a != null){
            a = a.next;
            len_A++;
        }

        while(b != null){
            b = b.next;
            len_B++;
        }
        if(len_A > len_B){
            for(int i = 0 ; i < len_A-len_B ;i++){
                headA = headA.next;
            }
        }else{
            for(int i = 0 ; i < len_B-len_A ;i++){
                headB = headB.next;
            }
        }
        while(headA != null && headB != null && headA != headB){
            headA = headA.next;
            headB = headB.next;
        }
        return headA;
    }
}