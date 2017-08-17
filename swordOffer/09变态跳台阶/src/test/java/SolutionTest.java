import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void jumpFloorII() throws Exception {
        Solution underTest = new Solution();
        assertEquals(underTest.JumpFloorII(0), 0);
        assertEquals(underTest.JumpFloorII(1), 1);
        assertEquals(underTest.JumpFloorII(2), 2);
        assertEquals(underTest.JumpFloorII(3), 4);
        assertEquals(underTest.JumpFloorII(4), 8);
        assertEquals(underTest.JumpFloorII(5), 16);
    }

}