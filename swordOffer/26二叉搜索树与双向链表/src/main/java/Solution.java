/**
 public class TreeNode {
 int val = 0;
 TreeNode left = null;
 TreeNode right = null;

 public TreeNode(int val) {
 this.val = val;

 }

 }
 */
public class Solution {
    TreeNode head = null, tail = null;
    public TreeNode Convert(TreeNode pRootOfTree) {
        ConvertSub(pRootOfTree);
        return head;
    }

    private void ConvertSub(TreeNode pRootOfTree) {
        if (pRootOfTree == null) {
            return;
        }
        ConvertSub(pRootOfTree.left);
        if (head == null) {
            head = pRootOfTree;
            tail = pRootOfTree;
        } else {
            tail.right = pRootOfTree;
            pRootOfTree.left  = tail;
            tail = pRootOfTree;
        }
        ConvertSub(pRootOfTree.right);
    }
}