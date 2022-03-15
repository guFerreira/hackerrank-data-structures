package tree.height_of_binary_tree;

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
    public static int height(Node root) {
        // Write your code here.
        if (root == null) {
            return -1;
        }
        int alturaEsquerda = height(root.left);
        int alturaDireita = height(root.right);
        if (alturaDireita > alturaEsquerda) {
            return alturaDireita + 1;
        } else {
            return alturaEsquerda + 1;
        }
    }
}
