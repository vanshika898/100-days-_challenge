import java.util.*;

public class psp {
    public static void main(String[] args) {
        int N = 5;
        int M = 3;

        int[] LA1 = { 4, 2, 8, 1, 6 };
        int[] LA2 = { 7, 3, 5 };
        int[] LA3 = new int[N + M];

        Arrays.sort(LA1);
        Arrays.sort(LA2);

        mergeArrays(LA1, LA2, LA3);

        System.out.println("Merged and Sorted Array (LA3): " + Arrays.toString(LA3));
    }

    private static void mergeArrays(int[] arr1, int[] arr2, int[] result) {
        int i = 0, j = 0, k = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                result[k++] = arr1[i++];
            } else {
                result[k++] = arr2[j++];
            }
        }
        while (i < arr1.length) {
            result[k++] = arr1[i++];
        }

        while (j < arr2.length) {
            result[k++] = arr2[j++];
        }
    }
}
