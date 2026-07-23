/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}
*/

class Solution {
    public List<Integer> postorder(Node root) {
        List<Integer> list = new ArrayList<>();
        postorder(list,root);
        return list;
    }
    public static void postorder(List<Integer>list,Node root){
        if(root == null){
            return;
        }
        if(root.children != null){
        for(Node c : root.children){
            postorder(list,c);
        }
        list.add(root.val);
        }
    }
}