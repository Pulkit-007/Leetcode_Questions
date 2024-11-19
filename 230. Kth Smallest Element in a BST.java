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
    public int kthSmallest(TreeNode root, int k) {
        Inorder(root,k);
        return ans;
        
    }
    int cnt=0;
    int ans=0;
    public void Inorder(TreeNode root,int k)
    {
        if(root==null) return;
        Inorder(root.left,k);
        cnt++;
        if(cnt==k){
            ans=root.val;
        }
        Inorder(root.right,k);
    }
}
