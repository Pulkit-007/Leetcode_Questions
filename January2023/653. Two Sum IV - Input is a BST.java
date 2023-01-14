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
    ArrayList<Integer> al=new ArrayList<>();
    public void inorder(TreeNode root)
    {
        if(root==null)
        return;
        inorder(root.left);
        al.add(root.val);
        inorder(root.right);
    }
    public boolean findTarget(TreeNode root, int k) 
    {
        inorder(root);
        // System.out.println(al);
        // return true;
        int low=0;
        int high=al.size()-1;
        while(low<high)
        {
            int val=al.get(low)+al.get(high);
            if(val==k)
            return true;
            else if(val>k)
            {
                high--;
            }
            else
            {
                low++;
            }
        }
        return false;
        
    }
}
