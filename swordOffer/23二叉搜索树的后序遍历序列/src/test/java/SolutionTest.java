import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void verifySquenceOfBST() throws Exception {
        Solution underTest = new Solution();
        int[] sequenceTrue = {5, 7, 6, 9, 11, 10, 8};
        int[] sequenceFalse = {1, 2, 3, 5, 0, 7, 4};
        assertTrue(underTest.VerifySquenceOfBST(sequenceTrue));
        assertFalse(underTest.VerifySquenceOfBST(sequenceFalse));
    }

}