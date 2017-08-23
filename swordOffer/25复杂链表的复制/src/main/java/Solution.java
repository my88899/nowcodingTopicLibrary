/*
public class RandomListNode {
    int label;
    RandomListNode next = null;
    RandomListNode random = null;

    RandomListNode(int label) {
        this.label = label;
    }
}
*/
public class Solution {
    public RandomListNode Clone(RandomListNode pHead) {
        if (pHead == null) {
            return null;
        }
        RandomListNode p = pHead;
        while (p != null){
            RandomListNode pNew = new RandomListNode(p.label);
            pNew.next = p.next;
            p.next = pNew;
            p = pNew.next;
        }
        p = pHead;
        while (p != null) {
            if (p.random != null){
                p.next.random = p.random.next;
            }
            p = p.next.next;
        }
        RandomListNode pNewHead = pHead.next;
        RandomListNode pNew = pNewHead;
        p = pHead;
        while (p != null) {
            p.next = p.next.next;
            if (pNew.next != null) {
                pNew.next = pNew.next.next;
            }
            pNew = pNew.next;
            p = p.next;
        }
        return pNewHead;
    }
}