
class doublell {
    class Node {
        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;

        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;

    }

    public void addlast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    public int removefirst() {
        if (size == 0) {
            System.out.println("list is empty");
            return Integer.MIN_VALUE;
        }
        if (size == 1) {
            int val = head.data;
            head = tail = null;
            return val;
        }
        int val = head.data;
        head.prev = null;
        head = head.next;
        return val;

    }

    public int removeLast() {
        if (size == 0) {
            System.out.println("list is empty");
            return Integer.MIN_VALUE;
        }
        if (size == 1) {
            int val = head.data;
            head = tail = null;
            return val;
        }
        Node temp = head;
        for (int i = 0; i < size - 2; i++) {
            temp = temp.next;
        }
        int val = tail.data;
        temp.next = null;
        return val;

    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "<-->");
            temp = temp.next;
        }
        System.out.println("null");
    }

}

public class doblley {
    public static void main(String[] args) {
        doublell ll = new doublell();
        ll.addFirst(20);
        ll.addFirst(10);
        ll.addlast(30);
        ll.print();
        // ll.removefirst();
        ll.removeLast();
        System.out.println(ll.size);
        ll.print();

    }

}
