import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    Solution underTest = new Solution();
    int[] inputArrary = {6, -3, -2, 7, -15, 1, 2, 2};
    int[][] inputArraryList = {{1, -2, 3, 10, -4, 7, 2, -5}, {-2, -8, -1, -5, -9}, {2, 8, 1, 5, 9}};
    int[] outputList = {18, -1, 25};

    @Test
    public void findGreatestSumOfSubArray() throws Exception {
        assertEquals(8, underTest.FindGreatestSumOfSubArray(inputArrary));
        assertEquals(outputList[0], underTest.FindGreatestSumOfSubArray(inputArraryList[0]));
        assertEquals(outputList[1], underTest.FindGreatestSumOfSubArray(inputArraryList[1]));
        assertEquals(outputList[2], underTest.FindGreatestSumOfSubArray(inputArraryList[2]));
        assertEquals(0, underTest.FindGreatestSumOfSubArray(null));
    }

}