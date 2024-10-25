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
    public int maxPathSum(TreeNode root) {
        int []maxi=new int[1];
        maxi[0]=Integer.MIN_VALUE;
        maxiPath(root,maxi);
        return maxi[0];
        
    }
    public static int maxiPath(TreeNode root,int [] maxi)
    {
        if(root==null) return 0;
        int maxL=Math.max(0,maxiPath(root.left,maxi));
        int maxR=Math.max(0,maxiPath(root.right,maxi));
        maxi[0]=Math.max(maxi[0],maxL+maxR+root.val);
        return root.val+Math.max(maxL,maxR);
    }
}
