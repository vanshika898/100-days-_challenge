public class q9 {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static class Stack {
        static public Node head = null;

        public static boolean isEmpty() {
            return head == null;
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

        public static int remove() {
            if (isEmpty()) {
                System.out.println("stack is empty");
                return Integer.MAX_VALUE;
            }
            int val = head.data;
            head = head.next;
            return val;
        }

        public static int peek() {
            if (isEmpty()) {
                System.out.println("stack is empty");
                return Integer.MAX_VALUE;
            }
            return head.data;
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(2);
        s.push(4);
        s.push(3);
        s.push(5);
        System.out.println("Stack values are:");
        while (!s.isEmpty()) {
            System.out.println(s.peek() + " ");
            s.remove();
        }
    }
}
