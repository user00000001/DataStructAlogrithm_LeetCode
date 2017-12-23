package com.bryanrady.datastruct_alogrithm.leetcode.binarytree;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wqb on 2017/12/23.
 */

public class Lc102_BinaryTreeLevelOrderTraversal {

    /**
     * 二叉树01（队列） - 二叉树的层序遍历 - 中等 - 102

     给定一个二叉树，返回其层序遍历结构（从左往右，一层一层地遍历）。

     比如： 给定二叉树 [3, 9 , 20 , null, null, 15, 7]，
             3
           / \
          9  20
       /  \
     15   7
     返回的结果应该是：
     [[3],[9, 20],[15, 7]]
     */

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        levelTraverse(root, 0, res);
        return res;
    }
    private void levelTraverse(TreeNode root, int depth, List<List<Integer>> res) {
        if (root == null) {
            return;
        }
        if (res.size() == depth) {
            res.add(new ArrayList<Integer>());
        }
        res.get(depth).add(root.val);
        levelTraverse(root.left, depth+1, res);
        levelTraverse(root.right, depth+1, res);
    }
}
