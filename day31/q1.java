public class q1 {
    public static int calculate(int arr[], int N) {
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total = total + arr[i];

        }
        return total;
    }

    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 4 };
        int x = arr.length;
        System.out.println(calculate(arr, x));

    }
}