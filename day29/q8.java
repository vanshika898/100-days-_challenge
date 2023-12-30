
class LinkedList {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
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
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void printlist() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.println("null");
    }

    public void addmid(int indx, int data) {
        int i = 0;
        Node temp = head;
        if (indx == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        while (i < indx - 1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;

    }
}

public class q8 {
    public static void main(String[] args) {
        LinkedList a = new LinkedList();
        a.addFirst(20);
        a.addFirst(30);
        a.addLast(10);
        a.addmid(2, 100);
        a.printlist();
        System.out.println(a.size);
    }
}
