class ListNode{
    public int val;
    public ListNode prev;
    public ListNode next;

    public ListNode(int val){
        this.val = val;
    }
}
class MyLinkedList {

    private ListNode head;
    private int capacity;
    /** Initialize your data structure here. */
    public MyLinkedList() {
        this.head = new ListNode(0);
        this.capacity = 0;
    }
    
    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        if(index >= capacity || index < 0 )
            return -1;
        ListNode temp = head;
        for(int i = 0 ; i <= index && temp != null; i++)
            temp = temp.next;
        return temp.val;
    }
    
    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        capacity++;
        ListNode cur = new ListNode(val);
        cur.next = head.next;
        head.next = cur;
    }
    
    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        capacity++;
        ListNode cur = new ListNode(val);
        ListNode temp = head;
        while( temp!= null && temp.next != null) temp = temp.next;
        cur.next = null;
        temp.next = cur;
    }
    
    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        if(index > capacity)
            return ;
        if(index < 0){
            addAtHead(0);
            capacity++;
            return;
        }
        capacity++;
        ListNode cur = new ListNode(val);
        ListNode temp = head;
        for(int i = 0 ; i < index; i++)
            temp = temp.next;
        cur.next = temp.next;
        temp.next = cur;
    }
    
    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        if(index >= capacity || index < 0)
            return ;
        capacity--;
        ListNode temp = head;
        for(int i = 0 ; i < index; i++)
            temp = temp.next;
        if(temp != null && temp.next != null)
            temp.next = temp.next.next;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */