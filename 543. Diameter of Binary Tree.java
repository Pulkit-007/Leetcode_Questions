/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    // int max=0;
    int diameter=0;
    // public static int getHeight(TreeNode root)
    // {
    //     // if(root==null) return 0;
        // int l=getHeight(root.left);
        // int r=getHeight(root.right);
        // return 1+Math.max(l,r);
    // }
    public int diameterOfBinaryTree(TreeNode root) {
        // int max=0;
        // if(root==null) return 0;
        // int lh=getHeight(root.left);
        // int rh=getHeight(root.right);
        // max=Math.max(max,lh+rh);
        // diameterOfBinaryTree(root.left);
        // diameterOfBinaryTree(root.right);
        // return max;
        helper(root);
        return diameter;


        
    }
    public int helper(TreeNode root)
    {
        if(root==null) return 0;
        int lh=helper(root.left);
        int rh=helper(root.right);
        diameter=Math.max(diameter,lh+rh);
        return 1+Math.max(lh,rh);
    }
}
