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
 class Pair{
    TreeNode node;
    int num;
    Pair(TreeNode _node,int _num)
    {
        num=_num;
        node=_node;
    }
 }
class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        if(root==null) return 0;
        int ans=0;
        Queue<Pair>q=new LinkedList<>();
        q.offer(new Pair(root,0));
        while(!q.isEmpty())
        {
            int size=q.size();
            int mmin=q.peek().num;
            int first=0, last=0;
            for(int i=0;i<size;i++)
            {
                int cur_id = q.peek().num - mmin;
                // Get the current node
                TreeNode node = q.peek().node;
                // Poll the front node from the queue
                q.poll();

                // If this is the first node in the level,
                // update the 'first' variable
                if (i == 0) 
                {
                    first = cur_id;

                }
                  if (i == size - 1) 
                {
                    last = cur_id;
                }

                // Enqueue the left child of the
                // current node with its position
                if (node.left != null) 
                {
                    q.add(new Pair(node.left, cur_id * 2 + 1));

                }
                if (node.right != null) {
                    q.add(new Pair(node.right, cur_id * 2 + 2));
                }
                
        
    }
    ans=Math.max(ans,last-first+1);
    }
    return ans;
}
}
