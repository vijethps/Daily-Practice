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
    public TreeNode replaceValueInTree(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        if(root==null){
            return null;
        }
        q.add(root);
        root.val=0;
        while(!q.isEmpty()){
            int size = q.size();
            int sum = 0;
            int j=0;
            for(int i=0;i<size;i++){
                TreeNode node = q.poll();

                if(node.left != null){
                    sum+=node.left.val;
                }
                if(node.right != null){
                    sum+=node.right.val;
                }
                q.add(node);
            }
            for(int i=0;i<size;i++){
                int sib = 0;
                TreeNode node = q.poll();
                if(node.left != null){
                    sib+=node.left.val;
                }
                if(node.right != null){
                    sib+=node.right.val;
                }
                if(node.left != null){
                    node.left.val = sum-sib;
                    q.add(node.left);
                }
                if(node.right != null){
                    node.right.val = sum-sib;
                    q.add(node.right);
                }
            }
        }
        return root;
    }
}