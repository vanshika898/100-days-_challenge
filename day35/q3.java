public class q3 {
    static class Node {
        char data;
        Node left;
        Node right;

        Node(char data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static int preIndex = 0;

    static Node buildtree(char in[], char prev[], int instart, int inEnd) {
        if (instart > inEnd)
            return null;
        Node node = new Node(prev[preIndex++]);
        if (instart == inEnd) {
            return node;
        }
        int inIndex = search(in, instart, inEnd, node.data);
        node.left = buildtree(in, prev, instart, inIndex - 1);
        node.right = buildtree(in, prev, inIndex + 1, inEnd);
        return node;
    }

    static int search(char arr[], int start, int end, char value) {
        int i;
        for (i = start; i <= end; i++) {
            if (arr[i] == value)
                return i;
        }
        return i;
    }

    static void postorder(Node node) {
        if (node == null)
            return;
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.data + " ");
    }

    public static void main(String[] args) {
        char in[] = { 'd', 'b', 'e', 'a', 'f', 'c', 'g' };
        char pre[] = { 'a', 'b', 'd', 'e', 'c', 'f', 'g' };
        int len = in.length;
        Node root = buildtree(in, pre, 0, len - 1);
        System.out.println("Postorder traversal of the tree:");
        postorder(root);
    }
}
