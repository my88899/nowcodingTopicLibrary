import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    Solution underTest = new Solution();
    int[] num = {0,0,1,3,5};
    @Test
    public void isContinuous() throws Exception {
        assertEquals(true, underTest.isContinuous(num));
    }

}