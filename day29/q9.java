
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

    public static int removefirst() {
        if (size == 0) {
            System.out.println("list is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            return val;
        }
        int val = head.data;
        head = head.next;
        return val;
    }

    public static int removeLast() {
        if (size == 0) {
            System.out.println("list is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            return val;
        }
        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }
        int val = tail.data;

        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    public int serch(int key) {
        Node temp = head;
        int i = 0;
        while (temp != null) {
            if (temp.data == key) {
                System.out.print("found at index:");
                return i;
            }

            temp = temp.next;
            i++;
        }
        System.out.println();
        System.out.print("not found so:");
        return -1;
    }
}

public class q9 {
    public static void main(String[] args) {
        LinkedList a = new LinkedList();
        a.addFirst(20);
        a.addFirst(30);
        a.addLast(10);
        a.addmid(2, 100);
        a.printlist();
        // System.out.println(a.size);
        a.removeLast();
        a.printlist();
        System.out.print(a.serch(20));
        System.out.print(a.serch(40));
    }
}
