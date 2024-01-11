public class q92 {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static class Queue {
        public static Node head;
        public static Node tail;

        public static boolean isEmpty() {
            return head == null;
        }

        public static void insert(int data) {
            Node newNode = new Node(data);
            if (isEmpty()) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        public static int remove() {
            if (isEmpty()) {
                System.out.print("Queue is empty");
                return -1;
            }
            int front = head.data;
            head = head.next;
            return front;
        }

        public static int peek() {
            if (isEmpty()) {
                return Integer.MAX_VALUE;
            }
            return head.data;
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.insert(4);
        q.insert(2);
        q.insert(4);
        System.out.println("Queue values are :");
        while (!q.isEmpty()) {
            System.out.println(q.peek() + " ");
            q.remove();
        }
    }
}
