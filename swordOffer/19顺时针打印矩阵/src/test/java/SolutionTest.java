import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    static int[][] matric = {{1,2,3,4},
                            {5,6,7,8},
                            {9,10,11,12},
                            {13,14,15,16}};
    static int[] tmp = {1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10};
    Solution underTest = new Solution();
    @Test
    public void printMatrix() throws Exception {
        assertArrayEquals(tmp, underTest.printMatrix(matric));
    }

}