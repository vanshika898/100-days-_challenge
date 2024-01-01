class sort {
    public static void bubble(int number[]) {
        for (int turn = 0; turn < number.length - 1; turn++) {
            for (int j = 0; j < number.length - 1 - turn; j++) {
                if (number[j] > number[j + 1]) {
                    int temp = number[j];
                    number[j] = number[j + 1];
                    number[j + 1] = temp;
                }
            }
        }
    }

    public static void printarr(int number[]) {
        System.out.print("[");
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i]);
            if (i < number.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
        System.out.println();
    }

    public static void mergearr(int arr1[], int arr2[], int result[]) {
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

public class array {
    public static void main(String[] args) {
        int N = 4;
        int M = 3;
        int LA1[] = { 40, 50, 30, 10 };
        int LA2[] = { 20, 60, 70 };
        int LA3[] = new int[N + M];
        System.out.print("LA1 is :");
        sort.printarr(LA1);
        System.out.print("LA2 is :");
        sort.printarr(LA2);
        System.out.print("Sorted LA1 is :");
        sort.bubble(LA1);
        sort.printarr(LA1);
        System.out.print("Sorted LA2 is :");
        sort.bubble(LA2);
        sort.printarr(LA2);
        sort.mergearr(LA1, LA2, LA3);
        System.out.print("LA3 is :");
        sort.printarr(LA3);
    }
}
