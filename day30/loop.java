/public class loop {
    public static void main(String[] args) {
        int[] A = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        for (int k = A.length - 2; k >= 0; k--) {
            
        }
        for (int value : A) {
            System.out.print(value + " ");
        }
    }
}

/*
 * public class loop {
 * public static void main(String[] args) {
 * int[] A = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
 * 
 * for (int k = 9; k >= 1; k--) {
 * A[k] = A[9];
 * }
 * 
 * // Print the values in array A after the loop
 * for (int value : A) {
 * System.out.print(value + " ");
 * }
 * }
 * }
 */