/*
 * LeetCode
 * 100. Same Tree
 */
package Exercises.Easy.Java;

import Exercises.DataStructures.TreeNode;

public class SameTree {
    public static void main(String[] args) {
        TreeNode n1 = new TreeNode(1, new TreeNode(2), null);
        TreeNode n2 = new TreeNode(1, null, new TreeNode(2));

        boolean result = isSameTree(n1, n2);
        System.out.println(result);
    }

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        String pDfs = dfs(p);
        String qDfs = dfs(q);

        return pDfs.equals(qDfs);
    }

    public static String dfs(TreeNode n) {
        if (n == null) {
            return "-";
        }
        return "" + n.val + dfs(n.left) + dfs(n.right);
    }
}
