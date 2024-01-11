import java.util.Scanner;

public class q2 {
    public static int linear(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println("Enter the number:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the value for index " + i + ":");
            a[i] = sc.nextInt();
        }

        System.out.println("Value found at index: " + linear(a, 5));
    }
}
