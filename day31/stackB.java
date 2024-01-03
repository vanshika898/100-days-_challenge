import java.util.*;

class stackB {
    static public class Node {// linked list
        // public class stack{
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head = null;
    public static int maxSize = 5;

    public static boolean isEmpty() {
        return head == null;
    }

    public static boolean isFull() {

        int currentSize = 0;
        Node current = head;

        while (current != null) {
            currentSize++;
            current = current.next;
        }

        return currentSize >= maxSize;
    }

    public static void push(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = newNode;
            return;

        }
        newNode.next = head;
        head = newNode;

    }

    public static int pop() {
        if (isEmpty()) {
            return -1;
        }
        int top = head.data;
        head = head.next;
        return top;
    }

    public static int peek() {
        if (isEmpty()) {
            return -1;
        }
        return head.data;
    }

    public static void pushAtBottom(stackB s, int data) {
        if (isEmpty()) {
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(s, data);
        push(top);
    }

    public static void reverse(stackB s) {
        if (isEmpty()) {
            return;
        }
        int top = s.pop();
        reverse(s);
        pushAtBottom(s, top);
    }

    public static void print(stackB s) {
        while (!isEmpty()) {
            System.out.println(s.peek() + " ");
            s.pop();
        }
    }

    public static void main(String[] args) {
        stackB s = new stackB();
        s.push(10);
        s.push(20);
        s.push(3);

        reverse(s);
        print(s);
    }

}
