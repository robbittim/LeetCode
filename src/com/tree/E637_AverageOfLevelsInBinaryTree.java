package com.tree;

import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*
7.8.21
637. Average of Levels in Binary Tree
https://leetcode.com/problems/average-of-levels-in-binary-tree/description/

 */
public class E637_AverageOfLevelsInBinaryTree {

    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> ret = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<TreeNode>();

        queue.add(root);

        while(!queue.isEmpty()){

            //get the size of current queue
            int queueSize = queue.size();
            // initialize the sum
            //      in each loop, we are recalculate the sum since the level changed
            double sum = 0;

            // loop up to the size of the queue
            //      everything on the current queue is the node in that current level
            for(int i = 0;i<queueSize;i++){

                //got the current node from the queue
                TreeNode node = queue.remove();

                sum = sum + node.val;

                // after we calculate the sum of one node, we add that node's child into the queue
                if(node.left !=null) queue.add(node.left);
                if (node.right!=null) queue.add(node.right);
            }

            double average  = sum/queueSize;
            ret.add(average);
        }


        return ret;
    }





}
