import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    Solution underTest = new Solution();
    @Test
    public void firstNotRepeatingChar() throws Exception {
//        assertEquals(6, underTest.FirstNotRepeatingChar("aoioebiaeou"));
        assertEquals(1, underTest.FirstNotRepeatingChar("NXWtnzyoHoBhUJaPauJaAitLWNMlkKwDYbbigdMMaYfkVPhGZcrEwp"));
    }

}