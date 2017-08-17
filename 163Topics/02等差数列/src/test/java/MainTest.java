import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {
    @Test
    public void testMainFunction() {
        Main underTest = new Main();
        String[] args = {"3", "3 1 2"};
        assertEquals(underTest.main(args), "Possible");
    }
}