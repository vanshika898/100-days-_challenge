import java.util.LinkedList;

class classroom {
    LinkedList<Integer> ll = new LinkedList<>();
    LinkedList<Integer> l2 = new LinkedList<>();

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node createCircularLinkedList(LinkedList<Integer> list) {
        Node head = null;
        Node tail = null;

        for (int data : list) {
            Node newNode = new Node(data);

            if (head == null) {
                head = tail = newNode;
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

    public static Node getMid(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static Node merge(Node head1, Node head2) {
        Node mergeLL = new Node(-1);
        Node temp = mergeLL;
        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
            }
            temp = temp.next;
        }
        if (head1 != null) {
            temp.next = head1;
        }
        if (head2 != null) {
            temp.next = head2;
        }
        return mergeLL.next;
    }

    public static Node mergeSort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node mid = getMid(head);
        Node rightHead = mid.next;
        mid.next = null;

        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);
        return merge(newLeft, newRight);
    }

    public static void print(Node head) {
        Node temp = head;
        while (head != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
}

class q14 {
    public static void main(String[] args) {
        classroom classroom = new classroom();

        classroom.ll.add(12);
        classroom.ll.add(28);
        classroom.ll.add(18);
        classroom.ll.add(25);
        classroom.ll.add(19);

        classroom.l2.add(5);
        classroom.l2.add(24);
        classroom.l2.add(12);
        classroom.l2.add(6);
        classroom.l2.add(15);

        classroom.Node list1 = classroom.createCircularLinkedList(classroom.ll);
        classroom.Node list2 = classroom.createCircularLinkedList(classroom.l2);

        System.out.print("Linked List 1: ");
        classroom.print(list1);

        System.out.print("Linked List 2: ");
        classroom.print(list2);

        list1 = classroom.mergeSort(list1);
        list2 = classroom.mergeSort(list2);

        classroom.Node mergedList = classroom.merge(list1, list2);

        System.out.print("\nSorted Linked List 1: ");
        classroom.print(list1);

        System.out.print("Sorted Linked List 2: ");
        classroom.print(list2);

        System.out.print("\nMerged Linked List: ");
        classroom.print(mergedList);
    }
}
