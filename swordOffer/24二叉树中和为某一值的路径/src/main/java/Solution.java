import java.util.ArrayList;

/**
 * public class TreeNode {
 * int val = 0;
 * TreeNode left = null;
 * TreeNode right = null;
 * <p>
 * public TreeNode(int val) {
 * this.val = val;
 * <p>
 * }
 * <p>
 * }
 */
public class Solution {
    private ArrayList<ArrayList<Integer>> lists = new ArrayList<ArrayList<Integer>>();
    private ArrayList<Integer> path = new ArrayList<>();

    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        if (root == null) {
            return lists;
        }
        path.add(root.val);
        target -= root.val;
        if (root.left == null && root.right == null && target == 0) {
            lists.add(new ArrayList<Integer>(path));
        }
        FindPath(root.left, target);
        FindPath(root.right, target);
        path.remove(path.size() - 1);
        return lists;
    }
}