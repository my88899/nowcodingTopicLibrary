import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    Solution underTest = new Solution();
    @Test
    public void power() throws Exception {
//        assertEquals(underTest.Power(1.1, 2), 1.21);
        assertEquals(Double.compare(underTest.Power(1.1, 2), 1.21), 1);
//        assertEquals(Double.compare(underTest.Power(2, -2), 0.25), 1);
//        assertEquals(Double.compare(underTest.Power(1.1, 0), 0), 1);
    }

}