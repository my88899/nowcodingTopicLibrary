import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void rectCover() throws Exception {
        Solution underTest = new Solution();
        assertEquals(underTest.RectCover(0), 0);
        assertEquals(underTest.RectCover(1), 1);
        assertEquals(underTest.RectCover(2), 2);
        assertEquals(underTest.RectCover(3), 3);
        assertEquals(underTest.RectCover(4), 5);
        assertEquals(underTest.RectCover(5), 8);
    }

}