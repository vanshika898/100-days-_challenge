class Solution {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node addToEmpty(Node last, int data) {
        if (last != null)
            return last;

        Node newNode = new Node(data);
        last = newNode;
        newNode.next = last;
        return last;
    }

    public static Node addFront(Node last, int data) {
        if (last == null)
            return addToEmpty(last, data);

        Node newNode = new Node(data);
        newNode.next = last.next;
        last.next = newNode;
        return last;
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

    public static Node mergeCircularLists(Node head1, Node head2) {
        if (head1 == null)
            return head2;
        if (head2 == null)
            return head1;

        Node last1 = head1;
        while (last1.next != head1) {
            last1 = last1.next;
        }

        Node last2 = head2;
        while (last2.next != head2) {
            last2 = last2.next;
        }

        Node sortedList1 = mergeSort(head1);
        Node sortedList2 = mergeSort(head2);

        last1.next = sortedList2;
        last2.next = sortedList1;

        return sortedList1;
    }

    public static void traverseCircularList(Node head) {
        Node temp = head;
        if (head != null) {
            do {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            } while (temp != head);
            System.out.println("null");
        } else {
            System.out.println("Empty Circular List");
        }
    }
}

public class q16 {
    public static void main(String[] args) {
        Solution.Node last1 = null;
        Solution.Node last2 = null;

        last1 = Solution.addToEmpty(last1, 12);
        last1 = Solution.addFront(last1, 28);
        last1 = Solution.addFront(last1, 18);
        last1 = Solution.addFront(last1, 25);
        last1 = Solution.addFront(last1, 19);

        last2 = Solution.addToEmpty(last2, 5);
        last2 = Solution.addFront(last2, 24);
        last2 = Solution.addFront(last2, 12);
        last2 = Solution.addFront(last2, 6);
        last2 = Solution.addFront(last2, 15);

        System.out.print("Circular List 1: ");
        Solution.traverseCircularList(last1);
        System.out.print("Circular List 2: ");
        Solution.traverseCircularList(last2);
        System.out.print("Merged Circular List: ");

        Solution.Node mergedList = Solution.mergeCircularLists(last1, last2);

        System.out.print("Merged Circular List: ");
        Solution.traverseCircularList(mergedList);

    }
}
