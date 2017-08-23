import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    Solution underTest = new Solution();
    @Test
    public void numberOf1() throws Exception {
        assertEquals(underTest.NumberOf1(1), 1);
        assertEquals(underTest.NumberOf1(2), 1);
        assertEquals(underTest.NumberOf1(3), 2);
        assertEquals(underTest.NumberOf1(8), 1);
        assertEquals(underTest.NumberOf1(-1), 32);
    }

}