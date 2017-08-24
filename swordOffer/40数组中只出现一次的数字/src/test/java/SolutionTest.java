import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    Solution underTest = new Solution();
    int [] array = {1,1,2,2,3,3,4,5,5,6,7,7,8,8,9,9};
    int [] num1 = new int[1];
    int [] num2 = new int[1];
    @Test
    public void findNumsAppearOnce() throws Exception {
        underTest.FindNumsAppearOnce(array, num1, num2);
        assertEquals(4, num1[0]);
        assertEquals(6, num2[0]);
    }

}