import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class SolutionTest {
    TreeNode[] NodeList3 = {new TreeNode(4,null,null),new TreeNode(5,null,null),new TreeNode(6,null,null),new TreeNode(7,null,null)};
    TreeNode[] NodeList2 = {new TreeNode(2,NodeList3[0],NodeList3[1]), new TreeNode(3,NodeList3[2],NodeList3[3])};
    TreeNode NodeList1 = new TreeNode(1,NodeList2[0],NodeList2[1]);
    Solution underTest = new Solution();
    ArrayList<Integer> shouldList = new ArrayList<Integer>(){{add(1);add(2);add(3);add(4);add(5);add(6);add(7);}};
    @Test
    public void printFromTopToBottom() throws Exception {
        assertArrayEquals(underTest.PrintFromTopToBottom(NodeList1),shouldList);
    }

}