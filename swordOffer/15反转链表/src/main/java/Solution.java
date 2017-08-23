/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class Solution {
    public ListNode ReverseList(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }
        ListNode thisNode = null;
        ListNode nextNode = null;
        while (head != null) {
            nextNode = head.next;
            head.next = thisNode;
            thisNode = head;
            head = nextNode;
        }
        return thisNode;
    }
}