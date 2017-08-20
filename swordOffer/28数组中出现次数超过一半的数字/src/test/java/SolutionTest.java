import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    Solution underTest = new Solution();
    int[] array = {1, 2, 3, 2, 2, 2, 5, 4, 2};
    int[] noArray = {1,2,3,2,4,2,5,2,3};
    @Test
    public void moreThanHalfNum_Solution() throws Exception {
        assertEquals(2, underTest.MoreThanHalfNum_Solution(array));
        assertEquals(0, underTest.MoreThanHalfNum_Solution(noArray));
    }

}