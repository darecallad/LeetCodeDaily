//Merge two sorted linked lists and return it as a sorted list.
//The list should be made by splicing together the nodes of the first two lists.

public class MergeTwoSortedList {

    public class ListNode{
        int val;
        ListNode next;
        ListNode(){}
        ListNode(int val){this.val = val;}
        ListNode(int val, ListNode next){
            this.val = val;
            this.next = next;
        }

    }
    public ListNode mergeTwoLists(ListNode l1, ListNode l2){
        // check if any list is null
        if(l1 == null) return l2;
        else if(l2 == null) return l1;
        // compare value between l1 and l2
        else if(l1.val < l2.val){
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        }
        else{
            l2.next = mergeTwoLists(l1,l2.next);
            return l2;
        }
    }
}
