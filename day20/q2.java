class q2 {
    public static void subarray(int number[]) {
        int ts = 0;
        int maxSum = Integer.MIN_VALUE; // Initialize maxSum with the lowest possible value
        int minSum = Integer.MAX_VALUE; // Initialize minSum with the highest possible value

        for (int i = 0; i < number.length; i++) {
            for (int j = i; j < number.length; j++) {
                int sum = 0; // Initialize sum for each subarray
                for (int k = i; k <= j; k++) {
                    System.out.print(number[k] + " ");
                    sum += number[k];
                }
                ts++;
                System.out.println();
                System.out.println("Sum is: " + sum);

                // Update maxSum and minSum
                if (sum > maxSum) {
                    maxSum = sum;
                }
                if (sum < minSum) {
                    minSum = sum;
                }
            }
            System.out.println();
        }
        System.out.println("Total number of subarrays: " + ts);
        System.out.println("Maximum sum: " + maxSum);
        System.out.println("Minimum sum: " + minSum);
    }

    public static void main(String args[]) {
        int number[] = { 1, 2, 3, 4 };
        subarray(number);
    }
}
