
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

    public static boolean serach(Node root, int val) {
        if (root == null) {
            return false;

        }
        if (root.data == val) {
            return true;
        }
        if (root.data > val) {
            return serach(root.left, val);
        } else {
            return serach(root.right, val);
        }
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

    public static Node findinordersuccesor(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    public static void printinrange(Node root, int k1, int k2) {

        if (root == null) {
            return;
        }

        printinrange(root.left, k1, k2);

        if (root.data >= k1 && root.data <= k2) {
            System.out.println(root.data + " ");
        }

        printinrange(root.right, k1, k2);
    }

    public static void main(String[] args) {
        int values[] = { 36, 22, 10, 44, 42, 16, 25, 3, 23 };
        Node root = null;

        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }

        printinrange(root, 10, 30);

    }
}
