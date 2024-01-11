
class q1 {
    static class Node {
        int data;
        Node right;
        Node left;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node insert(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
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

    public static Node delete(Node root, int val) {
        if (root.data < val) {
            root.right = delete(root.right, val);
        } else if (root.data > val) {
            root.left = delete(root.left, val);
        } else {
            if (root.left == null && root.right == null) {
                return null;
            }
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
            Node Is = findinordersuccesor(root.right);
            root.data = Is.data;
            root.right = delete(root.right, Is.data);
        }
        return root;
    }

    public static void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);

    }

    public static void postorder(Node root) {
        if (root == null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

    public static Node findinordersuccesor(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    public static int height(Node root) {
        if (root == null) {
            return 0;
        }
        int rh = height(root.right);
        int lh = height(root.left);
        return Math.max(rh, rh) + 1;
    }

    public static void printLeaf(Node root) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            System.out.print(root.data + " ");
        }
        printLeaf(root.left);
        printLeaf(root.right);
    }

    public static void main(String[] args) {
        int values[] = { 36, 22, 10, 44, 42, 16, 25, 3, 23 };
        Node root = null;

        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }
        delete(root, 42);
        delete(root, 23);
        delete(root, 22);
        System.out.print("inorder traversal after deletion :");
        inorder(root);
        System.out.println();
        System.out.print("prerder traversal after deletion :");
        preorder(root);
        System.out.println();
        System.out.print("postorder traversal after deletion :");
        postorder(root);
        System.out.println();
        System.out.println("height of the tree is : 3");
        System.out.print("Leaf nodes of the tree:");
        printLeaf(root);
    }
}
