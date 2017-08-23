/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class Solution {
    public ListNode Merge(ListNode list1, ListNode list2) {
        if(list1 == null) {
            return list2;
        }else if(list2 == null) {
            return list1;
        }
//        递归方法
        if (list1.val <= list2.val) {
            list1.next = Merge(list1.next, list2);
            return list1;
        } else {
            list2.next = Merge(list1, list2.next);
            return list2;
        }
//        非递归方法
//        ListNode newlist = null, pre = null;
//        if(list1.val <= list2.val) {
//            newlist = list1;
//            pre = list1;
//            list1 = list1.next;
//        } else {
//            newlist = list2;
//            pre = list2;
//            list2 = list2.next;
//        }
//        while (list1 != null && list2 != null) {
//            if(list1.val <= list2.val) {
//                pre.next = list1;
//                pre = list1;
//                list1 = list1.next;
//            } else {
//                pre.next = list2;
//                pre = list2;
//                list2 = list2.next;
//            }
//        }
//        if(list1 == null) {
//            pre.next = list2;
//        } else {
//            pre.next = list1;
//        }
//        return newlist;
    }
}