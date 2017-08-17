import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    Solution underTest = new Solution();
    @Test
    public void fibonacci() throws Exception {
        assertEquals(underTest.Fibonacci(1), 1);
        assertEquals(underTest.Fibonacci(2), 1);
        assertEquals(underTest.Fibonacci(3), 2);
        assertEquals(underTest.Fibonacci(4), 3);
    }

}