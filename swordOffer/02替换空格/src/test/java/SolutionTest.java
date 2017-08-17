import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    private static StringBuffer str = new StringBuffer("We Are Happy");
    Solution underTestSolution = new Solution();
    @Test public void testSolutionReplaceBlock() {
        assertEquals(underTestSolution.replaceSpace(str), "We%20Are%20Happy");
    }

}