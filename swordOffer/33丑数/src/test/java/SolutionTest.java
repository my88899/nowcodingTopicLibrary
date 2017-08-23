import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    Solution underTest = new Solution();
    @Test
    public void getUglyNumber_Solution() throws Exception {
        assertEquals(10,underTest.GetUglyNumber_Solution(9));
        assertEquals(12,underTest.GetUglyNumber_Solution(10));
        assertEquals(15,underTest.GetUglyNumber_Solution(11));
    }

}