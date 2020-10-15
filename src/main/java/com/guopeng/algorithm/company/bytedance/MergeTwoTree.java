package com.guopeng.algorithm.company.bytedance;

import java.util.Optional;

/**
 * 来源：
 * 题目：
 * 解题思路：
 *
 * @author jony.huang
 * @date 2020/10/15 14:34
 */
public class MergeTwoTree {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if(t1 ==null){
            return t2;
        }
        if(t2 ==null){
            return t1;
        }
        TreeNode node = new TreeNode(t1.val+t2.val);
        node.left = mergeTrees(t1.left,t2.left);
        node.right = mergeTrees(t1.right,t2.right);
        return node;
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}

