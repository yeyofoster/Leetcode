/*
 * LeetCode
 * 104. Maximum Depth of Binary Tree
 */
package Exercises.Easy.Java;

import Exercises.DataStructures.TreeNode;

public class MaximumDepthBinaryTree {
    public static void main(String[] args) {
        // Input: root = [3,9,20,null,null,15,7]
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        int result = maxDepth(root);
        System.out.println(result);
    }

    public static int maxDepth(TreeNode root) {
        // Handling null root
        if (root == null) {
            return 0;
        }

        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}
