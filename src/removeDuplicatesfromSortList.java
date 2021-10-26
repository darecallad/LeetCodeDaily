public class removeDuplicatesfromSortList {
    public class ListNode{
        int val;
        ListNode next;
        ListNode(){}
        ListNode(int val){this.val = val;};
        ListNode(int val, ListNode next){this.val = val; this.next = next;}
    }
    // run time O(n) space complexity O(1)
    public ListNode deleteDuplicates(ListNode head){
        var current = head;

        while(current != null && current.next != null){
            if(current.val == current.next.val) current.next = current.next.next;
            else current = current.next;

        }
        return head;
    }
}
