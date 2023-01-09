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
    public List<Integer> preorderTraversal(TreeNode root) {
        // List<Integer> pre=new ArrayList<>();
        // if(root ==null) return pre;
        // Stack<TreeNode> sk=new Stack<>();
        // sk.push(root);
        // while(!sk.isEmpty())
        // {
        //     TreeNode curr=sk.pop();
        //     pre.add(curr.val);
        //     if(root.right!=null)
        //     {
        //         sk.push(root.right);
        //     }
        //     if(root.left!=null)
        //     {
        //         sk.push(root.right);
        //     }
            
        // }
        // return pre;
        List<Integer> ans=new ArrayList<>();
        traversal(root,ans);
        return ans;

        
    }
    public void traversal(TreeNode root,List<Integer> ans)
    {
        if(root==null)  return;
        ans.add(root.val);
        traversal(root.left,ans);
        traversal(root.right,ans);
    }
}
