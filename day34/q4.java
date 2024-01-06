
class Node {
    char data;
    Node left, right;

    public Node(char item) {
        data = item;
        left = right = null;
    }
}

public class q4 {
    Node root;

    int search(char arr[], int start, int end, char value) {
        int i;
        for (i = start; i <= end; i++) {
            if (arr[i] == value) {
                return i;
            }
        }
        return i;
    }

    Node buildTree(char in[], char pre[], int inStart, int inEnd, int preIndex) {
        if (inStart > inEnd) {
            return null;
        }

        Node node = new Node(pre[preIndex]);

        if (inStart == inEnd) {
            return node;
        }

        int inIndex = search(in, inStart, inEnd, node.data);

        node.left = buildTree(in, pre, inStart, inIndex - 1, preIndex + 1);
        node.right = buildTree(in, pre, inIndex + 1, inEnd, preIndex + inIndex - inStart + 1);

        return node;
    }

    void printPostorder(Node node) {
        if (node == null) {
            return;
        }

        printPostorder(node.left);
        printPostorder(node.right);
        System.out.print(node.data + " ");
    }

    public static void main(String[] args) {
        q4 tree = new q4();
        char in[] = { 'd', 'b', 'e', 'a', 'f', 'c', 'g' };
        char pre[] = { 'a', 'b', 'd', 'e', 'c', 'f', 'g' };
        int len = in.length;
        tree.root = tree.buildTree(in, pre, 0, len - 1, 0);

        System.out.print("Postorder traversal: ");
        tree.printPostorder(tree.root);
    }
}
