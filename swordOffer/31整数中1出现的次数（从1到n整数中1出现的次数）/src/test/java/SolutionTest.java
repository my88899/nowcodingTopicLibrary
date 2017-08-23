import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    Solution underTest = new Solution();
    @Test
    public void numberOf1Between1AndN_Solution() throws Exception {
        assertEquals(6, underTest.NumberOf1Between1AndN_Solution(13));
    }

}