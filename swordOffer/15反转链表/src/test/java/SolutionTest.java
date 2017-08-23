import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    ListNode node3 = new ListNode(3, null);
    ListNode node2 = new ListNode(2, node3);
    ListNode node1 = new ListNode(1, node2);
    ListNode nodenull = null;
    Solution underTest = new Solution();
    @Test
    public void reverseList() throws Exception {
        assertSame(underTest.ReverseList(node1), node3);
        assertSame(underTest.ReverseList(nodenull),null);
    }

}