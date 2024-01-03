import java.util.Scanner;

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
        if (last != null) {
            return last; // Return the last as it is not empty
        }

        Node newNode = new Node(data);
        newNode.next = newNode;
        last = newNode;

        return last;
    }

    public static Node addFront(Node last, int data) {
        if (last == null) {
            return null; // If the list is empty, return null
        }

        Node newNode = new Node(data);
        newNode.next = last.next;
        last.next = newNode;

        return last;
    }

    public static void traverseCircularList(Node last) {
        if (last == null) {
            System.out.println("Empty Circular List");
            return;
        }

        Node first = last.next;

        do {
            System.out.print(first.data + " -> ");
            first = first.next;
        } while (first != last.next);

        System.out.println("NULL");
    }

    public static int findMaximum(Node head) {
        if (head == null) {
            return Integer.MIN_VALUE;
        }

        int max = head.data;
        Node temp = head.next;

        do {
            max = Math.max(max, temp.data);
            temp = temp.next;
        } while (temp != head);

        return max;
    }

    public static Node mergeCircularLists(Node last1, Node last2) {
        if (last1 == null || last2 == null) {
            return null;
        }

        Node first1 = last1.next;
        Node first2 = last2.next;

        Node temp1 = first1;
        Node temp2 = first2;

        int max1 = findMaximum(last1);
        int max2 = findMaximum(last2);

        if (max1 < max2) {
            last1.next = first2;
            last2.next = first1;
        } else {
            last2.next = first1;
            last1.next = first2;
        }

        // Update the last pointers
        last1 = temp1;
        last2 = temp2;

        return last1;
    }

    public static void main(String[] args) {
        Node last1 = null;
        Node last2 = null;
        Node last = null;

        last1 = addToEmpty(last1, 12);
        last1 = addFront(last1, 28);
        last1 = addFront(last1, 18);
        last1 = addFront(last1, 25);
        last1 = addFront(last1, 19);

        last2 = addToEmpty(last2, 5);
        last2 = addFront(last2, 24);
        last2 = addFront(last2, 12);
        last2 = addFront(last2, 6);
        last2 = addFront(last2, 15);

        System.out.print("Circular List 1: ");
        traverseCircularList(last1);
        System.out.print("Circular List 2: ");
        traverseCircularList(last2);

        int maxList1 = findMaximum(last1);
        int maxList2 = findMaximum(last2);

        System.out.println("Maximum value in List 1: " + maxList1);
        System.out.println("Maximum value in List 2: " + maxList2);

        last = mergeCircularLists(last1, last2);

        System.out.print("Merged Circular List: ");
        traverseCircularList(last);
    }

}
