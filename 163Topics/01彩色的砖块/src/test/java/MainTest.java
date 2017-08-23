import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {
    @Test public void MainTrue(){
        Main underTest = new Main();
        String[] args = {"ABAB"};
        assertEquals(underTest.main(args), "aoe");
    }
}