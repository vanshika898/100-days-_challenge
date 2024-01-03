public class q10 {
    public static void circle(int matrix[][]) {
        int startrow = 0;
        int endrow = matrix.length - 1;
        int startcol = 0;
        int endcol = matrix[0].length - 1;
        int multiplier = 2;

        while (startrow <= endrow && startcol <= endcol) {
            for (int j = startcol; j <= endcol; j++) {
                System.out.print(matrix[startrow][j] * multiplier + " ");
            }
            for (int i = startrow + 1; i <= endrow; i++) {
                System.out.print(matrix[i][endcol] * multiplier + " ");
            }
            for (int j = endcol - 1; j >= startcol; j--) {
                if (startcol == endcol) {
                    break;
                }
                System.out.print(matrix[endrow][j] * multiplier + " ");
            }
            for (int i = endrow - 1; i > startrow; i--) {
                if (startrow == endrow) {
                    break;
                }
                System.out.print(matrix[i][startcol] * multiplier + " ");
            }
            multiplier *= -1;
            startcol++;
            startrow++;
            endrow--;
            endcol--;
        }
    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
        System.out.print("Matrix is:");
        circle(matrix);
    }
}
