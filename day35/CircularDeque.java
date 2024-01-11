public class CircularDeque {
    char[] deque;
    int capacity;
    int left;
    int right;

    public CircularDeque(int capacity) {
        this.capacity = capacity;
        this.deque = new char[capacity];
        this.left = -1;
        this.right = -1;
    }

    public void addToRight(char element) {
        if (isFull()) {
            System.out.println("Deque is full. Cannot add element: " + element);
            return;
        }

        if (isEmpty()) {
            left = right = 0;
        } else {
            right = (right + 1) % capacity;
        }

        deque[right] = element;
        System.out.println("Added " + element + " to the right");
        displayDeque();
    }

    public void deleteTwoFromRight() {
        if (isEmpty()) {
            System.out.println("Deque is empty. Cannot delete elements from the right.");
            return;
        }

        if (left == right) {
            left = right = -1;
        } else {
            right = (right - 2 + capacity) % capacity;
        }

        System.out.println("Deleted two elements from the right");
        displayDeque();
    }

    public void addToLeft(char element) {
        if (isFull()) {
            System.out.println("Deque is full. Cannot add element: " + element);
            return;
        }

        if (isEmpty()) {
            left = right = 0;
        } else {
            left = (left - 1 + capacity) % capacity;
        }

        deque[left] = element;
        System.out.println("Added " + element + " to the left");
        displayDeque();
    }

    public boolean isFull() {
        return (left == 0 && right == capacity - 1) || (left == right + 1);
    }

    public boolean isEmpty() {
        return left == -1;
    }

    public void displayDeque() {
        System.out.print("LEFT=" + left + ", RIGHT=" + right + ", DEQUE: ");
        for (int i = 0; i < capacity; i++) {
            if (deque[i] != '\u0000') {
                System.out.print(deque[i] + ", ");
            } else {
                System.out.print("____, ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        CircularDeque circularDeque = new CircularDeque(6);

        circularDeque.addToRight('A');
        circularDeque.addToRight('C');
        circularDeque.addToRight('D');

        circularDeque.deleteTwoFromRight();

        circularDeque.addToLeft('K');
        circularDeque.addToLeft('L');
        circularDeque.addToLeft('M');
    }
}
