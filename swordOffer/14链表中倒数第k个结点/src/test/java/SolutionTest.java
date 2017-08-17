/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}*/
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    ListNode node3 = new ListNode(3, null);
    ListNode node2 = new ListNode(2, node3);
    ListNode node1 = new ListNode(1, node2);
    Solution underTest = new Solution();
    @Test
    public void findKthToTail() throws Exception {
        assertEquals(underTest.FindKthToTail(node1, 1).val, node3.val);
    }

}