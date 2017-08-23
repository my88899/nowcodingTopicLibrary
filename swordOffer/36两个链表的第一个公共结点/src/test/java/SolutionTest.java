import org.junit.Test;
import org.w3c.dom.NodeList;

import static org.junit.Assert.*;

public class SolutionTest {
    Solution underTest = new Solution();
    ListNode pHead1 = new ListNode(1);
    ListNode pHead2 = new ListNode(2);
    ListNode exceptN = new ListNode(3);
    @Test
    public void findFirstCommonNode() throws Exception {
        assertEquals(pHead2, underTest.FindFirstCommonNode(pHead1, pHead2));
    }

}