import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class SolutionTest {
    ArrayList<Integer> list = new ArrayList<Integer>() {{
        add(1);
        add(9);
    }};
    ArrayList<Integer> list2 = new ArrayList<Integer>() {{
        add(4);
        add(11);
    }};
    Solution underTest = new Solution();
    int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    int[] array2 = {1,2,4,7,11,15};

    @Test
    public void findNumbersWithSum() throws Exception {
//        assertEquals(list, underTest.FindNumbersWithSum(array, 10));
        assertEquals(list2, underTest.FindNumbersWithSum(array2, 15));
    }

}