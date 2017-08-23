import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {
    ListNode list1_3 = new ListNode(6, null);
    ListNode list1_2 = new ListNode(4, list1_3);
    ListNode list1_1 = new ListNode(2, list1_2);
    ListNode list2_3 = new ListNode(5, null);
    ListNode list2_2 = new ListNode(4, list2_3);
    ListNode list2_1 = new ListNode(3, list2_2);
    Solution underTest = new Solution();
    @Test
    public void merge() throws Exception {
        assertSame(underTest.Merge(list1_1,list2_1), list1_1.val <= list2_1.val ? list1_1 : list2_1);
    }

}