public class pre {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.right = null;
            this.left = null;
        }

    }

    static class binarytree {
        static int indx = -1;

        public static Node buildTree(int nodes[]) {
            indx++;
            if (indx >= nodes.length || nodes[indx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[indx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;

        }

        public static void preorder(Node root) {
            if (root == null) {
                return;

            }
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }
    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        binarytree b = new binarytree();
        Node root = b.buildTree(nodes);
        // System.out.println(root.data);
        b.preorder(root);

    }

}
