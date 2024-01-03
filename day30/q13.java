class sort {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public static Node createCircularLinkedList(int[] arr) {
        Node head = null;
        Node tail = null;

        for (int data : arr) {
            Node newNode = new Node(data);

            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        if (tail != null) {
            tail.next = head; // Make the list circular
        }

        return head;
    }

    public static Node getmid(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static Node merge(Node head1, Node head2) {
        Node mergell = new Node(-1);
        Node temp = mergell;
        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }
        while (head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }
        while (head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
        return mergell.next;
    }

    public static Node mergesort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node mid = getmid(head);
        Node righthead = mid.next;
        mid.next = null;

        Node newLeft = mergesort(head);
        Node newright = mergesort(righthead);
        return merge(newLeft, newright);
    }

    public static void print() {
        if (head == null) {
            return;
        }

        Node current = head;

        do {
            System.out.print(current.data + " -> ");
            current = current.next;
        } while (current != head);

        System.out.println("NULL");
    }
}

public class q13 {
    public static void main(String[] args) {
        // Input arrays for circular linked lists
        int[] arr1 = { 12, 28, 18, 25, 19 };
        int[] arr2 = { 5, 24, 12, 6, 15 };
        sort s = new sort();
        sort s2 = new sort();

    }
}
