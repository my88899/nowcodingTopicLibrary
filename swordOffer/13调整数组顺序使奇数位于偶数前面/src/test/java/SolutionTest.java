import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    Solution underTest = new Solution();
    @Test
    public void reOrderArray() throws Exception {
        int[] array = {1,2,3,4,5,6,7};
        int[] arraysShould = {1,3,5,7,2,4,6};
        assertArrayEquals(underTest.reOrderArray(array),arraysShould);
    }

}