package tree.binary_search_tree_insertion;

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

    public static void preOrder(Node root) {

        if (root == null)
            return;

        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);

    }

 /* Node is defined as :
 class Node
    int data;
    Node left;
    Node right;

    */

    public static Node insert(Node root, int data) {
        if (root == null) {
            root = new Node(data);
        } else {
            //inserir na direita
            if (data > root.data) {
                if (root.right != null) {
                    insert(root.right, data);
                } else {
                    root.right = new Node(data);
                }
                //inserir na esquerda
            } else {
                if (root.left != null) {
                    insert(root.left, data);
                } else {
                    root.left = new Node(data);
                }
            }
        }
        return root;
    }
}