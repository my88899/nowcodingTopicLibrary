import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    Solution underTest = new Solution();
    String str = "student. a am I";
    String strOut = "I am a student.";
    @Test
    public void reverseSentence() throws Exception {
        assertEquals(strOut, underTest.ReverseSentence(str));
        assertEquals("", underTest.ReverseSentence(""));
        assertEquals("", underTest.ReverseSentence(null));
        assertEquals("\" \"", underTest.ReverseSentence("\" \""));
        assertEquals(" ", underTest.ReverseSentence(" "));
    }

}