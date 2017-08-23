import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class SolutionTest {
    Solution underTest = new Solution();
    int[] input = {4, 5, 1, 6, 2, 7, 3, 8};
    ArrayList<Integer> ShouldOutput = new ArrayList<Integer>(){{add(4);add(3);add(2);add(1);}};
    @Test
    public void getLeastNumbers_Solution() throws Exception {
        assertEquals(ShouldOutput, underTest.GetLeastNumbers_Solution(input, 4));
    }

}