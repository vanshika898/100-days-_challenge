public class q3 {
    static class Node {
        char data;
        Node right;
        Node left;

        Node(char data) {
            this.data = data;
            this.right = null;
            this.left = null;
        }
    }

    static class binarytree {
        static int index = -1;

        public static Node Buildtree(char nodes[]) {
            index++;
            if (index >= nodes.length || nodes[index] == '0') {
                return null;
            }
            Node newNode = new Node(nodes[index]);
            newNode.left = Buildtree(nodes);
            newNode.right = Buildtree(nodes);
            return newNode;
        }

        public static void postorder(Node root) {
            if (root == null) {
                return;
            }
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " ");
        }

        public static void preorder(Node root) {
            if (root == null) {
                return;
            }
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }

        public static void Inorder(Node root) {
            if (root == null) {
                return;
            }
            Inorder(root.left);
            System.out.print(root.data + " ");
            Inorder(root.right);
        }
    }

    public static void main(String[] args) {
        char nodes[] = { 'a', 'b', 'd', 'e', 'c', 'f', 'g' };
        binarytree b = new binarytree();
        Node root = b.Buildtree(nodes);

        b.preorder(root);
        System.out.println();
        b.postorder(root);
        System.out.println();
    }
}
