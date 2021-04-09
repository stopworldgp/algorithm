package com.gp.algorithm.shopee;

import java.util.ArrayList;
import java.util.List;

/**
 * 来源：https://leetcode-cn.com/problems/binary-tree-right-side-view/solution/er-cha-shu-de-you-shi-tu-by-leetcode-solution/
 * 题目:二叉树的右视图
 * 解题思路
 * 1. 递归求解
 *
 * @Author theone
 * @Date 2021/4/9 23:34
 * @Version 1.0
 */
public class RightSideView {
    List<Integer> res = new ArrayList<>();

    public List<Integer> rightSideView(TreeNode root) {
        dfs(root,0);
        return res;
    }

    private void dfs(TreeNode root, int depth) {
        if(root==null){
            return;
        }
        if(res.size()==depth){
            res.add(root.val);
        }
        dfs(root.right,depth+1);
        dfs(root.left,depth+1);
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

}
