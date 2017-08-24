public class Solution {
    boolean flag = true;
    public boolean IsBalanced_Solution(TreeNode root) {
        getDepth(root);
        return flag;
    }

    private int getDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = getDepth(root.left);
        int right = getDepth(root.right);
        if (Math.abs(left - right) > 1) {
            flag = false;
        }
        return (left > right ? left : right) + 1;
    }
}