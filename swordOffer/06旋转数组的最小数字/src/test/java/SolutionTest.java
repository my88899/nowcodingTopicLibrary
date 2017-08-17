import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    Solution underTest = new Solution();
    @Test
    public void minNumberInRotateArray() throws Exception {
        int[] a = {3, 4, 5, 1, 2};
        assertEquals(underTest.minNumberInRotateArray(a), 1);
    }

}