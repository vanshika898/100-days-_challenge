class bulidtree {
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
        public static int indx = -1;

        public static Node buildTree(int[] nodes) {
            indx++;
            if (indx >= nodes.length || nodes[indx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[indx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }

        public static void print(Node root, int level) {
            if (root == null) {
                return;
            }
            print(root.right, level + 1);
            for (int i = 0; i < level; i++) {
                System.out.print("    ");
            }
            System.out.println(root.data);
            print(root.left, level + 1);
        }
    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, 5, 3 };
        binarytree b = new binarytree();
        Node root = b.buildTree(nodes);
        System.out.println(root.data);
        b.print(root, 0);
    }
}
