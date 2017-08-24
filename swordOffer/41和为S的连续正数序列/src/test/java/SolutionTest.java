import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class SolutionTest {
    Solution underTest = new Solution();
    ArrayList<Integer> list = new ArrayList<Integer>(){{add(1);add(2);}};
    ArrayList<ArrayList<Integer>> lists = new ArrayList<ArrayList<Integer>>(){{add(list);}};
    ArrayList<ArrayList<Integer>> listull = new ArrayList<ArrayList<Integer>>();
    @Test
    public void findContinuousSequence() throws Exception {
        assertEquals(lists, underTest.FindContinuousSequence(3));
        assertEquals(listull,underTest.FindContinuousSequence(4));
    }

}