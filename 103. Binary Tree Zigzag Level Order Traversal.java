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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if(root == null)
        return new ArrayList<>();
        Queue<TreeNode> que = new LinkedList<>();
        que.add(root);
        List<List<Integer>> ans = new ArrayList<>();
        boolean leftToRight = true;
        while(!que.isEmpty()) {
            int size = que.size();
            List<Integer> subList = new ArrayList<>();
            for(int i=0;i<size;i++) {
                TreeNode node = que.poll();
                if(node != null) {
                    if(node.left != null)
                    que.add(node.left);
                    if(node.right != null)
                    que.add(node.right);
                    subList.add(node.val);
                }
            }
            if(!leftToRight) {
                Collections.reverse(subList);
            }
            ans.add(subList);
            leftToRight = leftToRight ? false : true;
        }
        return ans;
    }
}
