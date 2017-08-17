import org.junit.Test;
import static org.junit.Assert.*;

public class SolutionTest {
    Solution classUnderTest = new Solution();
    private static int[][] aSort = {{1,2,8,9},
                                    {2,4,9,12},
                                    {4,7,10,13},
                                    {6,8,11,15}};
    @Test
    public void find() throws Exception {
        int target = 7;
        assertTrue(classUnderTest.Find(target, aSort));
    }
    @Test
    public void testSolutionFalse() {
        int target = 17;
        assertFalse(classUnderTest.Find(target, aSort));
    }
    @Test
    public void testFourCorner() {
        int target1 = 1, target2 = 9, target3 = 6, target4 = 15;
        assertTrue(classUnderTest.Find(target1, aSort));
        assertTrue(classUnderTest.Find(target2, aSort));
        assertTrue(classUnderTest.Find(target3, aSort));
        assertTrue(classUnderTest.Find(target4, aSort));
    }
}