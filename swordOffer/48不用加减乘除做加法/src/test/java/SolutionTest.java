import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    Solution underTest = new Solution();
    @Test
    public void add() throws Exception {
        assertEquals(12, underTest.Add(5, 7));
    }

}