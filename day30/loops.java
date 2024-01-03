public class loops {
    public static void main(String[] args) {

        int[] A = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        System.out.print("Initial array as: ");
        for (int i = 0; i < A.length; ++i) {
            System.out.print(A[i] + " ");
        }
        System.out.println();
        for (int k = A.length - 2; k > 0; k--) {
            A[k + 1] = A[9];
        }

        System.out.print("(Array loop after b condition is): ");
        for (int i = 1; i < A.length - 1; ++i) {
            System.out.print(A[i] + " ");
        }
        System.out.println();
        System.out.println();
    }
}