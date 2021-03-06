package tree.tree_preorder_traversal;


class Node{
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

/* you only have to complete the function given below.
Node is defined as

class Node {
    int data;
    Node left;
    Node right;
}

*/

    public static void preOrder(Node root) {

        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);

    }
}