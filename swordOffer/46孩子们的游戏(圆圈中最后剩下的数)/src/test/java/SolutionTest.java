import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    Solution underTest = new Solution();
    @Test
    public void lastRemaining_Solution() throws Exception {
        assertEquals(3, underTest.LastRemaining_Solution(5,3));
    }

}