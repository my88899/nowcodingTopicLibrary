import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    Solution underTest = new Solution();
    int[] array = {0, 1, 2, 3, 4, 5, 6};

    @Test
    public void getNumberOfK() throws Exception {
        assertEquals(1, underTest.GetNumberOfK(array, 3));
    }

}