package com.guopeng.algorithm.company.bytedance;

/**
 *对称的二叉树
 *请实现一个函数，用来判断一棵二叉树是不是对称的。如果一棵二叉树和它的镜像一样，那么它是对称的。
 * @Author theone
 * @Date 2020/10/11 20:59
 * @Version 1.0
 */
public class SymmetricalTree {
    public boolean isSymmetric(TreeNode root) {
        return root == null ? true : recur(root.left, root.right);
    }

    private boolean recur(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        }

        if (left == null || right == null || left.val != right.val) {
            return false;
        }

        return recur(left.left, right.right) && recur(left.right, right.left);


    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
