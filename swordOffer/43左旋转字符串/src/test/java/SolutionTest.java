import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    Solution underTest = new Solution();
    String str = "abcXYZdef";
    String strShitf3 = "XYZdefabc";
    @Test
    public void leftRotateString() throws Exception {
        assertEquals(strShitf3, underTest.LeftRotateString(str, 12));
    }

}