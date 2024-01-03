class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class q9 {

    public static Node createList(int... data) {
        Node head = null, tail = null;
        for (int value : data) {
            Node node = new Node(value);
            if (head == null) {
                head = tail = node;
            } else {
                tail.next = node;
                tail = node;
            }
        }
        return head;
    }

    public static void makeCircular(Node head) {
        if (head == null) {
            return;
        }
        Node tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }
        tail.next = head;
    }

    public Node getMid(Node head) {

    }

    public static Node findNode(Node head, int data) {
        Node current = head;
        if (head == null) {
            return null; // Handle empty list
        }
        do {
            if (current.data == data) {
                return current;
            }
            current = current.next;
        } while (current != head);
        return null;
    }

    public static void printList(Node head) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node current = head;
        do {
            System.out.print(current.data + " -> ");
            current = current.next;
        } while (current != head);
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        Node head1 = createList(12, 28, 18, 25, 19);
        Node head2 = createList(5, 24, 12, 6, 15);

        makeCircular(head1);
        makeCircular(head2);

        int max1 = findMax(head1);
        int max2 = findMax(head2);

        mergeLists(head1, max1, head2, max2);

        printList(head1); // Output: 12 -> 28 -> 24 -> 12 -> 6 -> 15 -> 5 -> 18 -> 25 -> 19 -> NULL
    }
}