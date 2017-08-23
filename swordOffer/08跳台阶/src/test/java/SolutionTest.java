import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void jumpFloor() throws Exception {
        Solution underTest = new Solution();
        assertEquals(underTest.JumpFloor(0), 0);
        assertEquals(underTest.JumpFloor(1), 1);
        assertEquals(underTest.JumpFloor(2), 2);
        assertEquals(underTest.JumpFloor(3), 3);
        assertEquals(underTest.JumpFloor(4), 5);
    }

}