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
    public void flatten(TreeNode root) {
        List<TreeNode> list = new ArrayList<>();
        preorder(list,root);
        int m = list.size();
        for(int i=0;i<m-1;i++){
             TreeNode cur = list.get(i);
             TreeNode next = list.get(i+1);
             cur.left = null;
             cur.right = next;
        }
        if(!list.isEmpty()){
            TreeNode last = list.get(list.size()-1);
            last.left = null;
            last.right = null;
        }
    }
    public static void preorder(List<TreeNode> list,TreeNode root){
        if(root == null){
            return;
        }
        list.add(root);
        preorder(list,root.left);
        preorder(list,root.right);

    }
}