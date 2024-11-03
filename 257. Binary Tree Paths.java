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
    public static void def(TreeNode root,List<String>ans,String s)
    {
        if(root==null) return;
        s+=(root.val);
        if(root.left==null && root.right==null)
        {
            ans.add(s);

        }
        def(root.left,ans,s+"->");
        def(root.right,ans,s+"->");
        return;
    }
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans=new ArrayList<>();
        def(root,ans,"");
        return ans;
        
    }
}
