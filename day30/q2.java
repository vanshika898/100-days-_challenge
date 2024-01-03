public class q2 {
    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };

        display(matrix);
    }

    private static void display(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int numCircles = (Math.min(rows, cols) + 1) / 2;

        for (int circle = 0; circle < numCircles; circle++) {
            int multiplier = (circle % 2 == 0) ? 2 : -2;

            for (int i = circle; i < cols - circle; i++) {
                System.out.print(matrix[circle][i] * multiplier + " ");
            }

            for (int i = circle + 1; i < rows - circle; i++) {
                System.out.print(matrix[i][cols - 1 - circle] * multiplier + " ");
            }

            for (int i = cols - 2 - circle; i >= circle; i--) {
                System.out.print(matrix[rows - 1 - circle][i] * multiplier + " ");
            }
            for (int i = rows - 2 - circle; i > circle; i--) {
                System.out.print(matrix[i][circle] * multiplier + " ");
            }
        }
    }
}
