package com.guopeng.algorithm.company.bytedance;

/**
 * 来源：https://leetcode-cn.com/problems/diameter-of-binary-tree/
 * 解题思路：
 * 计算节点的左右树深度
 *
 * @author jony.huang
 * @date 2020/10/14 15:08
 */
public class DiameterOfBinaryTree {

    private int ans = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null) {
            return 0;
        }
        depth(root);
        return ans;
    }

    /**
     * 查找节点node 左右树的深度
     * 比较ans 看该节点是不是最大的直径
     * @param node
     * @return
     */
    private int depth(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int L = depth(node.left);
        int R = depth(node.right);
        ans = Math.max(ans, L + R );
        return Math.max(L, R) + 1;
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
