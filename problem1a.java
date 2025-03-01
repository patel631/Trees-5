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

class populatingNextRightPointerInEachNode {
    public Node connect(Node root) {
        if(root == null) return root;;
        
        Node lvl = root;
        
        while(lvl.left != null){
            Node curr = lvl;
            while(curr != null){
                curr.left.next = curr.right;
                if(curr.next != null){
                    curr.right.next = curr.next.left;
                }
                curr = curr.next;
            }
            lvl = lvl.left;
        }
        return root;
    }
}

//time complexity O(n)
//space complexity O(1)