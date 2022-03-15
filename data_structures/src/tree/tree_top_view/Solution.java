package tree.tree_top_view;

class Node {
    Node left;
    Node right;
    int data;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class Solution {

    /*

    class Node
        int data;
        Node left;
        Node right;
    */
    public static void topView(Node root) {

        while(true){
            if(root == null){
                return;
            }
            System.out.print(root.data+" ");
            root = root.right;
        }
    }
}
