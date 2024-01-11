public class q4 {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node insert(Node root, int val) {
        if (root == null) {
            return new Node(val);
        }
        if (root.data > val) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }
        return root;
    }

    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static int height(Node root) {
        if (root == null) {
            return 0;
        }
        int rh = height(root.right);
        int lh = height(root.left);
        return Math.max(rh, lh) + 1;
    }

    public static void main(String[] args) {
        int values[] = { 10, 1, 3, 5, 15, 12, 16 };
        Node root = null;
        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }
        System.out.println("root of the tree is : " + root.data);
        System.out.println("height of the tree is :" + height(root));
        System.out.print("inorder traversal of binary search tree: ");
        inorder(root);
        System.out.println();
    }
}
