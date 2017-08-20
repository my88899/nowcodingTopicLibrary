import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    int[] pushA = {1,2,3,4,5};
    int[] popA1 = {4,5,3,2,1};
    int[] popA2 = {4,3,5,1,2};
    Solution underTest = new Solution();
    @Test
    public void isPopOrder() throws Exception {
        assertTrue(underTest.IsPopOrder(pushA, popA1));
        assertFalse(underTest.IsPopOrder(pushA, popA2));
    }

}