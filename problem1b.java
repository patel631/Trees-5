/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class populatingNextRightPointerInEachNodeB {
    public Node connect(Node root) {
        if(root == null) return root;
        
        dfs(root.left, root.right);
        return root;
    }
    
    private void dfs(Node left, Node right){
        if(left == null) return;
        
        left.next = right;
        
        dfs(left.left, left.right);
        dfs(left.right, right.left);
        dfs(right.left, right.right);
    }
}
//time complexity O(n)
//space complexity O(h)