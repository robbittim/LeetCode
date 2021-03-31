package com.tree;

/*

110. Balanced Binary Tree
https://leetcode.com/problems/balanced-binary-tree/
 */
public class BalancedBinaryTree_110 {

    public boolean isBalanced(TreeNode root) {

      int heightDiff = countDepth(root);

      if(heightDiff!=-1){ return true;}
      else  return false;


    }

    public int countDepth (TreeNode tree){
        int countLeft = 0;
        int countRight = 0 ;

        if(tree==null) return 0;

            countLeft = countDepth(tree.left);
            countRight = countDepth(tree.right);

        System.out.println("countLeft = " + countLeft);
        System.out.println("countRight = " + countRight);
        //we dont know which subTree is higher, so we need Math.abs()

    if(countLeft>=0 && countRight>=0 && Math.abs(countLeft-countRight)<=1)
    {return Math.max(countLeft,countRight) + 1;}
    return -1; // mean the subTree is not balanced
    }

}
