/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        List<Integer> list = new ArrayList<>();
        if(root == null){
            return list;
        }
        Queue<TreeNode> q = new LinkedList<>();
        Set<TreeNode> set = new HashSet<>();
        Map<TreeNode,TreeNode> map = new HashMap<>();
        map = parent(root);
        TreeNode tar = target;
        q.add(tar);
        set.add(tar);
        int dis = 0;
        while(!q.isEmpty()){
            int m = q.size();
            if(dis==k){
                while(!q.isEmpty()){
                    list.add(q.poll().val);
                }
                break;
            }
            for(int i=0;i<m;i++){
                TreeNode temp = q.poll();
                if(temp.left != null && !set.contains(temp.left)){
                    q.add(temp.left);
                    set.add(temp.left);
                } 
                if(temp.right != null && !set.contains(temp.right)){
                    q.add(temp.right);
                    set.add(temp.right);
                }
                TreeNode cur = map.get(temp);
                if(cur != null && !set.contains(cur)){
                    q.add(cur);
                    set.add(cur);
                } 
            }
            dis++;
        } 
        return list;
    }
    public static HashMap<TreeNode,TreeNode> parent(TreeNode root){
        HashMap<TreeNode,TreeNode> map = new HashMap<>();
        Queue <TreeNode> q = new LinkedList<>();
           if(root == null){
            return map;
           }
           q.add(root);
           while(!q.isEmpty()){
            TreeNode temp = q.poll();
            if(temp.left != null){
                q.add(temp.left);
                map.put(temp.left,temp);
            } 
            if(temp.right != null){
                q.add(temp.right);
                map.put(temp.right,temp);
            }
           }
           return map;
    }

}