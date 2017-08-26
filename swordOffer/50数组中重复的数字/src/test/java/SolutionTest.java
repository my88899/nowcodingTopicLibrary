import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    Solution underTest = new Solution();
    int[] array = {2, 3, 1, 0, 2, 5, 3};
    int[] tmpOut = new int[1];
    @Test
    public void duplicate() throws Exception {
        assertEquals(true, underTest.duplicate(array, array.length, tmpOut));
    }

}