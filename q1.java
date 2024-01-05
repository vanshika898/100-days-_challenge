public class q1 {
    static class Node {
        char data;
        Node left;
        Node right;

        Node(char data) {
            this.data = data;
            this.right = null;
            this.left = null;
        }

    }

    static class binarytree {
        static int indx = -1;

        public static Node buildTree(char nodes[]) {
            indx++;
            if (indx >= nodes.length || nodes[indx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[indx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;

        }

        public static void inorder(Node root) {
            if (root == null) {
                return;

            }
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    public static void main(String[] args) {
        char nodes[] = { 'G', 'D', 'B', 'H', 'I', 'E', 'F', 'C', 'A' };

        binarytree b = new binarytree();
        Node root = b.buildTree(nodes);
        System.out.println(root.data);
        b.inorder(root);

    }

}
