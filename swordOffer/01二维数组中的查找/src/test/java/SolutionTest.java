import org.junit.Test;
import static org.junit.Assert.*;

public class SolutionTest {
    Solution classUnderTest = new Solution();
    private static int[][] aSort = {{9,8,7},
            {6,5,4},
            {3,2,1}};
    @Test
    public void find() throws Exception {
        int target = 5;
        assertTrue(classUnderTest.Find(target, aSort));
    }
    @Test public void testSolutionFalse() {
        int target = 10;
        assertFalse(classUnderTest.Find(target, aSort));
    }
}