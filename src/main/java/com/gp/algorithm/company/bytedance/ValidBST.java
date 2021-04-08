package com.gp.algorithm.company.bytedance;

/**
 * 来源：https://leetcode-cn.com/problems/validate-binary-search-tree/
 * 题目：是否为搜索二叉树
 * 解题思路：
 * 1.二叉搜索树性质， 左节点下边的所有节点小于根节点，右节点下边的所有节点都大于根节点，所以只要判断 每个节点是否在这个范围内(low,upper)
 * 2. 举例:  3 1 null null 2  ，2节点的范围就是 (1,3)
 * 备注 只考虑单个节点的左右孩子，就会出现单节点满足而  整体不满足的情况 如   4 3 null 2 5
 *
 * @author jony.huang
 * @date 2020/10/14 20:54
 */
public class ValidBST {
    public boolean isValidBST(TreeNode root) {
        return isBST(root, null, null);
    }

    private boolean isBST(TreeNode root, Integer low, Integer upper) {
        if (root == null) {
            return true;
        }
        if (low != null && low >= root.val) {
            return false;
        }
        if (upper != null && upper <= root.val) {
            return false;
        }
        return isBST(root.left, low, root.val) & isBST(root.right, root.val, upper);
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
