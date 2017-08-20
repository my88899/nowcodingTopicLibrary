import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class SolutionTest {
    Solution underTest = new Solution();
    String str = "abc";
    ArrayList<String> listShould = new ArrayList<String>(){{add("abc");add("acb");add("bac");add("bca");add("cab");add("cba");}};
    ArrayList<String> listShould2 = new ArrayList<String>(){{add("aa");}};
//    ArrayList<String> listShould = new ArrayList<String>(){{add("a");add("b");add("c");}};
    @Test
    public void permutation() throws Exception {
        assertEquals(listShould, underTest.Permutation(str));
        assertEquals(listShould2, underTest.Permutation("aa"));
    }

}