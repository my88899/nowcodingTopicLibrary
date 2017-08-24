import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    Solution underTest = new Solution();
    TreeNode pHead = new TreeNode(1);
    @Test
    public void treeDepth() throws Exception {
        assertEquals(1, underTest.TreeDepth(pHead));
    }

}