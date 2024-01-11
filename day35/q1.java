public class q1 {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    class Queue {
        Node head = null;
        Node tail = null;

        public boolean isEmpty() {
            return head == null && tail == null;
        }

        public void add(int data) {
            Node newNode = new Node(data);
            if (isEmpty()) {
                head = tail = newNode;
            }
            tail.next = newNode;
            tail = newNode;
        }

        public int remove() {
            if (isEmpty()) {
                return -1;
            }
            int front = head.data;
            if (tail == head) {
                tail = head = null;
            } else {
                head = head.next;
            }
            return front;
        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("empty queue");
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String[] args) {
        q1.Queue q = new q1().new Queue();
        q.add(9);
        q.add(2);
        int t1 = q.peek();
        q.add(-6);
        q.remove();
        q.add(14);
        int t2 = q.remove();
        q.add(3);

        System.out.println("value of t1 is: " + t1);
        System.out.println("value of t2 is: " + t2);
    }
}
